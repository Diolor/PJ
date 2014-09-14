parser grammar variables;


variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId (assignRule variableInitializer)?
    ;

variableDeclaratorId
    :   identifierRule (lbraceRule rbraceRule)*
    ;




variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;



variableModifier
    :   finalRule
    |   annotation
    ;