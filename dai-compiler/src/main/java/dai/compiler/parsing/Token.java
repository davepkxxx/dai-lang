package dai.compiler.parsing;

public enum Token {

    // special tokens
    EMPTY,
    EOF, // end of file
    IDENTIFIER, // id
    // keywords
    VAR,
    // symbols
    EQUALS,
    COMMA,
    SEMI;

}
