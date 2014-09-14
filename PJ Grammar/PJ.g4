grammar PJ;

@parser::header{
package com.lorentzos.pj;
}

import classes, methods, fields, constructors, interfaces, annotations, enums, blocks, statements, variables, types, expressions,
symbolRules, Symbols, Literals, Identifiers, Spaces;



//  PARSER RULERS
//
//		classes
//		methods
//
//		fields
//		constructors
//
//		interfaces
//		annotations
//		enums
//
//		blocks
//		statements
//
//      variables
//      types
//      expressions




//  LEXER RULES
//
//      Symbols:
//          KEYWORDS
//          SEPARATORS
//          OPERATORS
//          SPECIAL
//
//      Literals:
//          NULL
//          BOOLEAN
//          CHARACTER
//          STRING
//          ESCAPES
//          INTEGER
//          FLOAT
//
//		Identifiers
//
//      Spaces:
//          SPACES & COMMENTS



tokens { INDENT, DEDENT }

@lexer::header {
package com.lorentzos.pj;

import java.util.Arrays;
import java.util.List;

}


@lexer::members {

	List<Integer> keywords = Arrays.asList(
    	PACKAGE, IMPORT, STATIC, PRIVATE, PROTECTED, PUBLIC, VOID, CLASS, FINAL,
    	ASSERT, BREAK, CONTINUE, RETURN, THROW, THROWS, NEW
    );

	List<Integer> prependAndAppend = Arrays.asList(
    	IMPLEMENTS, EXTENDS, ASSIGN, QUESTION, COLON, COMMA, ADD, SUB
    );


    @Override
    public Token emit() {
        if( keywords.contains(getType()) ){
            setText(getText()+" ");
        }else if( prependAndAppend.contains(getType())){
        	setText(" "+getText()+" ");
        }
        return super.emit();
    }


	private java.util.Queue<Token> tokens = new java.util.LinkedList<>();
	private java.util.Stack<Integer> indents = new java.util.Stack<>();
	private int opened = 0;

	@Override
	public void emit(Token t) {
		super.setToken(t);
		tokens.offer(t);
	}

	@Override
	public Token nextToken() {

		if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
			while (!indents.isEmpty()) {
				this.emit(new CommonToken(PJParser.DEDENT, "DEDENT"));
				indents.pop();
		  	}
		}

		Token next = super.nextToken();
		return tokens.isEmpty() ? next : tokens.poll();
	}


	public static int getIndentationCount(String spaces) {
		int count = 0;

		for (char ch : spaces.toCharArray()) {
		  switch (ch) {
			case '\t':
			  count += 8 - (count % 8);
			  break;
			default:
			  count++;
		  }
		}

		return count;
	}
}


// starting point for parsing a pj file
pj
    :   packageDeclaration? importDeclaration* typeDeclaration* EOF
    ;


packageDeclaration
    :   annotation* packageRule qualifiedName
    ;


importDeclaration
	:	importRule staticRule? qualifiedName (dotRule mulRule)?
	;


typeDeclaration
    :   classOrInterfaceModifier* classDeclaration
    |   classOrInterfaceModifier* interfaceDeclaration
    |   classOrInterfaceModifier* annotationTypeDeclaration
    |   classOrInterfaceModifier* enumDeclaration
    ;







testingRule
	:	expression
	;





elementValue
    :   elementValueArrayInitializer
    |   annotation
    |   expression
    ;

elementValueArrayInitializer
    :   '{' (elementValue (commaRule elementValue)*)? (commaRule)? '}'
    ;








formalParameters
    :   lparenRule formalParameterList? rparenRule
    ;

formalParameterList
    :   formalParameter (commaRule formalParameter)* (commaRule lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifier* type variableDeclaratorId
    ;

lastFormalParameter
    :   variableModifier* type '...' variableDeclaratorId
    ;




constDeclaration
    :   type constantDeclarator (commaRule constantDeclarator)* ';'
    ;

constantDeclarator
    :   Identifier ('[' ']')* '=' variableInitializer
    ;






qualifiedNameList
    :   qualifiedName (commaRule qualifiedName)*
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;


identifierRule
	:	Identifier
	;