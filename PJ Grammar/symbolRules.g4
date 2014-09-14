parser grammar symbolRules;


abstractRule:			ABSTRACT;
assertRule:				ASSERT;
booleanRule:			BOOLEAN;
breakRule:				BREAK;
byteRule:				BYTE;
caseRule:				CASE;
catchRule:				CATCH;
charRule:				CHAR;
classRule:				CLASS;
constRule:				CONST;
continueRule:			CONTINUE;
defaultRule:			DEFAULT;
doRule:					DO;
doubleRule:				DOUBLE;
elseRule:				ELSE;
enumRule:				ENUM;
extendsRule:			EXTENDS;
finalRule:				FINAL;
finallyRule:			FINALLY;
floatRule:				FLOAT;
forRule:				FOR;
ifRule:					IF;
gotoRule:				GOTO;
implementsRule:			IMPLEMENTS;
importRule:				IMPORT;
instanceofRule:			INSTANCEOF;
intRule:				INT;
interfaceRule:			INTERFACE;
longRule:				LONG;
nativeRule:				NATIVE;
newRule:				NEW;
packageRule:			PACKAGE;
privateRule:			PRIVATE;
protectedRule:			PROTECTED;
publicRule:				PUBLIC;
returnRule:				RETURN;
shortRule:				SHORT;
staticRule:				STATIC;
strictfpRule:			STRICTFP;
superRule:				SUPER;
switchRule:				SWITCH;
synchronizedRule:		SYNCHRONIZED;
thisRule:				THIS;
throwRule:				THROW;
throwsRule:				THROWS;
transientRule:			TRANSIENT;
tryRule:				TRY;
voidRule:				VOID;
volatileRule:			VOLATILE;
whileRule:				WHILE;


lparenRule:				LPAREN;		// (
rparenRule:				RPAREN;		// )
lbraceRule:				LBRACE;		// {
rbraceRule:				RBRACE;  	// }
lbrackRule:				LBRACK;  	// [
rbrackRule:				RBRACK;  	// ]
semiRule:				SEMI;
commaRule:				COMMA;
dotRule:				DOT;


assignRule:				ASSIGN;
gtRule:					GT;
ltRule:					LT;
bangRule:				BANG;
tildeRule:				TILDE;
questionRule:			QUESTION;
colonRule:				COLON;
equalRule:				EQUAL;
leRule:					LE;
geRule:					GE;
notEqualRule:			NOTEQUAL;
andRule:				AND;
orRule:					OR;
incRule:				INC;
decRule:				DEC;
addRule:				ADD;
subRule:				SUB;
mulRule:				MUL;
divRule:				DIV;
bitandRule:				BITAND;
bitorRule:				BITOR;
caretRule:				CARET;
modRule:				MOD;


add_assignRule:				ADD_ASSIGN;
sub_assignRule:				SUB_ASSIGN;
mul_assignRule:				MUL_ASSIGN;
div_assignRule:				DIV_ASSIGN;
and_assignRule:				AND_ASSIGN;
or_assignRule:				OR_ASSIGN;
xor_assignRule:				XOR_ASSIGN;
mod_assignRule:				MOD_ASSIGN;
lshift_assignRule:			LSHIFT_ASSIGN;
rshift_assignRule:			RSHIFT_ASSIGN;
urshift_assignRule:			URSHIFT_ASSIGN;


atRule:						AT;
ellipsisRule:				ELLIPSIS;