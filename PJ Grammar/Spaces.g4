lexer grammar Spaces;

// WHITE SPACE AND COMMENTS


NEWLINE
	// TODO skip newline if there is a following comment
    : ( '\r'? '\n' | '\r' ) SPACES?
    {
        String spaces = getText().replaceAll("[\r\n]+", "");
        int next = _input.LA(1);

        if (opened > 0 || next == '\r' || next == '\n' ) {
            skip();
        }
        else {
            int indent = getIndentationCount(spaces);
            int previous = indents.isEmpty() ? 0 : indents.peek();

            if (indent == previous) {
                skip();
            } else if (indent > previous) {
                indents.push(indent);
                emit(new CommonToken(PJParser.INDENT, "INDENT"));
            } else {
                while(!indents.isEmpty() && indents.peek() > indent) {
                    emit(new CommonToken(PJParser.DEDENT, "DEDENT"));
                    indents.pop();
                }
            }
        }
    }
    ;


SKIP
    :   ( SPACES | COMMENT | LINE_COMMENT ) -> skip
    ;

NEWLINE
	// TODO skip newline if there is a following comment
    : ( '\r'? '\n' | '\r' ) SPACES?
    ;


// FRAGMENTS

fragment
SPACES
    : [ \t]+
    ;

fragment
COMMENT
    :   '/*' .*? '*/'
    ;

fragment
LINE_COMMENT
    :   '//' ~[\r\n]*
    ;