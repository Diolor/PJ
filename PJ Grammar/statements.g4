parser grammar statements;



statement
    :   block																		# simpleBlockStatement
    |	statementsCommaless															# commalessStatement
    |   ifRule parExpression statement (elseRule statement)?						# ifStatement
    |   forRule  forControl  statement												# forStatement
    |   'while' parExpression statement												# whileStatement
    |   tryRule block (catchClause+ finallyBlock? | finallyBlock)					# tryStatement
    |   tryRule resourceSpecification block catchClause* finallyBlock?				# tryStatement
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'		# switchStatement
    |   synchronizedRule parExpression block										# synchronizedStatement
    |   identifierRule ':' statement												# identifierStament
    ;

statementsCommaless
	:	expression
    |   returnRule expression?
    |   throwRule expression
    |   breakRule identifierRule?
    |   continueRule identifierRule?
    |   assertRule expression (':' expression)?
    |   doRule statement whileRule parExpression
	;



parExpression
//todo
    :    expression
    ;


catchClause
    :   catchRule catchDeclaration block
    ;

catchDeclaration
	:	variableModifier* catchType identifierRule
	;

catchType
    :   qualifiedName ('|' qualifiedName)*
    ;

finallyBlock
    :   finallyRule block
    ;

resourceSpecification
    :   '(' resources ';'? ')'
    ;

resources
    :   resource (';' resource)*
    ;

resource
    :   variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
    ;



/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   'case' constantExpression ':'
    |   'case' enumConstantName ':'
    |   'default' ':'
    ;

constantExpression
    :   expression
    ;

enumConstantName
    :   Identifier
    ;



forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   variableModifier* type variableDeclaratorId colonRule expression
    ;

forUpdate
    :   expressionList
    ;