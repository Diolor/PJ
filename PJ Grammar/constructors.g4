parser grammar constructors;



genericConstructorDeclaration
    :   typeParameters constructorDeclaration
    ;

constructorDeclaration
    :   Identifier formalParameters ('throws' qualifiedNameList)?
        constructorBody
    ;

constructorBody
    :   block
    ;
