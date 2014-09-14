parser grammar blocks;



block
    :   ':'? INDENT blockStatement* DEDENT
    ;

blockStatement
    :   localVariableDeclaration
    |   statement
    |   typeDeclaration
    ;




/*localVariableDeclarationStatement
    :    localVariableDeclaration
    ;*/

localVariableDeclaration
    :   variableModifier* type variableDeclarators
    ;