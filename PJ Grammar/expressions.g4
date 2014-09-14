parser grammar expressions;


// EXPRESSIONS


expressionList
    :   expression (commaRule expression)*
    ;

expression
    :   primary
    |   expression dotRule identifierRule
    |   expression dotRule 'this'
    |   expression dotRule newRule nonWildcardTypeArguments? innerCreator
    |   expression dotRule 'super' superSuffix
    |   expression dotRule explicitGenericInvocation
    |   expression lbrackRule expression rbrackRule
    |   expression lparenRule expressionList? rparenRule
    |   newRule creator
    |   lparenRule type rparenRule expression
    |   expression (incRule | decRule)
    |   (addRule|subRule| incRule | decRule) expression
    |   ('~'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression (addRule|subRule) expression
    |   expression (ltRule ltRule | gtRule gtRule gtRule | gtRule gtRule) expression
    |   expression (leRule | geRule | gtRule | ltRule) expression
    |   expression 'instanceof' type
    |   expression (equalRule | notEqualRule) expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression questionRule expression colonRule expression
    |   <assoc=right> expression
        (   assignRule //TODO the rest below
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
        )
        expression
    ;



primary
    :   lparenRule expression rparenRule
    |   thisRule
    |   superRule
    |   literal
    |   identifierRule
    |   type dotRule 'class'
    |   'void' dotRule 'class'
    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | 'this' arguments)
    ;




literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;




nonWildcardTypeArgumentsOrDiamond
    :   ltRule gtRule
    |   nonWildcardTypeArguments
    ;

nonWildcardTypeArguments
	:   ltRule typeList gtRule
	;



explicitGenericInvocation
    :   nonWildcardTypeArguments explicitGenericInvocationSuffix
    ;

explicitGenericInvocationSuffix
	:   'super' superSuffix
	|   Identifier arguments
	;

superSuffix
    :   arguments
    |   dotRule Identifier arguments?
    ;

arguments
	:   lparenRule expressionList? rparenRule
	;






// creators

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   identifierRule typeArgumentsOrDiamond? (dotRule Identifier typeArgumentsOrDiamond?)*
    |   primitiveType
    ;

classCreatorRest
	:   arguments classBody?
	;

arrayCreatorRest
	:   lbrackRule
		(   rbrackRule (lbrackRule rbrackRule)* arrayInitializer
		|   expression rbrackRule (lbrackRule expression rbrackRule)* (lbrackRule rbrackRule)*
		)
	;

innerCreator
    :   Identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;
