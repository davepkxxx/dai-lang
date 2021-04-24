package dai.compiler.parsing;

public enum Token {

    // special tokens
    EMPTY,
    EOF, // end of file
    IDENTIFIER,

    // iterals,
    INT,

    // keywords
    VAR,

    // symbols
    EQUALS,
    COMMA,
    SEMI;

}
