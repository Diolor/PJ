parser grammar methods;



genericMethodDeclaration
    :   typeParameters methodDeclaration
    ;

methodDeclaration
    :   (type|voidRule) identifierRule formalParameters ('[' ']')*
        (throwsRule qualifiedNameList)?
        methodBody?
    ;

methodBody
    :   block
    ;