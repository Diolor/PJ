parser grammar annotations;



annotationTypeDeclaration
    :   atRule interfaceRule identifierRule annotationTypeBody
    ;

annotationTypeBody
    :   '{' (annotationTypeElementDeclaration)* '}'
    ;

annotationTypeElementDeclaration
    :   modifier* annotationTypeElementRest
    |   ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
    ;

annotationTypeElementRest
    :   annotationTypeDeclaration ';'?
    |   type annotationMethodOrConstantRest ';'
    |   classDeclaration ';'?
    |   interfaceDeclaration ';'?
    |   enumDeclaration ';'?
    ;

annotationMethodOrConstantRest
	:   annotationMethodRest
	|   annotationConstantRest
	;

annotationMethodRest
	:   Identifier lparenRule rparenRule defaultValue?
	;

annotationConstantRest
	:   variableDeclarators
	;

defaultValue
	:   'default' elementValue
	;






annotation
    :   atRule annotationName ( lparenRule ( elementValuePairs | elementValue )? rparenRule )?
    ;

annotationName
    :   qualifiedName
    ;

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    :   Identifier '=' elementValue
    ;