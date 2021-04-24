package dai.compiler.parsing;

public enum Token {

    // special tokens
    EMPTY,
    EOF, // end of file
    IDENTIFIER,

    // literals,
    INT,
    LONG,
    DOUBLE,
    FLOAT,

    // keywords
    VAR,

    // symbols
    EQUALS,
    COMMA,
    SEMI

}
