parser grammar types;


typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   Identifier ('extends' typeBound)?
    ;

typeBound
    :   type ('&' type)*
    ;




typeList
    :   type (',' type)*
    ;


type
    :   classOrInterfaceType (lbrackRule rbrackRule)*
    |   primitiveType (lbrackRule rbrackRule)*
    ;




classOrInterfaceType
    :   identifierRule typeArguments? (dotRule identifierRule typeArguments? )*
    ;

typeArguments
    :   ltRule typeArgument (commaRule typeArgument)* gtRule
    ;

typeArgument
    :   type
    |   '?' (('extends' | 'super') type)?
    ;

typeArgumentsOrDiamond
    :   ltRule gtRule
    |   typeArguments
    ;



primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;