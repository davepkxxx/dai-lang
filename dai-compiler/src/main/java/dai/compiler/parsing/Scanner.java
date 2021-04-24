package dai.compiler.parsing;

import dai.compiler.syntax.Position;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class Scanner extends Reader {

    @NotNull
    private Token token = Token.EMPTY;

    private int tokenOffset;

    private int tokenLine;

    private int tokenColumn;

    private Position tokenPos;

    @NotNull
    private final StringBuilder buffer = new StringBuilder();

    @NotNull
    private String raw = "";

    @Nullable
    private Scanner prev;

    @Nullable
    private Scanner next;

    public Scanner(@NotNull String code) {
        super(code);
    }

    protected @NotNull Token getToken() {
        return token;
    }

    private void appendChar() {
        this.buffer.append(this.getCurrChar());
    }

    protected @NotNull String getRaw() {
        return raw;
    }

    private void finishRaw() {
        this.raw = this.buffer.toString();
    }

    protected @Nullable Scanner getPrev() {
        return prev;
    }

    protected @Nullable Scanner getNext() {
        return next;
    }

    private void refreshTokenOffset() {
        this.tokenOffset = this.getOffset();
        this.tokenLine = this.getLine();
        this.tokenColumn = this.getColumn();
    }

    protected Position getTokenPos() {
        return tokenPos;
    }

    protected Position newTokenPos() {
        this.tokenPos = new Position();
        this.tokenPos.setStartOffset(this.tokenOffset);
        this.tokenPos.setStartLine(this.tokenLine);
        this.tokenPos.setStartColumn(this.tokenColumn);
        return this.tokenPos;
    }

    protected void init() {
        this.prev = new Scanner(this.getCode());
        this.prev.next = this;

        this.next = new Scanner(this.getCode());
        this.next.prev = this;

        this.nextToken();
    }

    private void copyFrom(Scanner from) {
        this.token = from.token;
        this.tokenOffset = from.tokenOffset;
        this.tokenLine = from.tokenLine;
        this.tokenColumn = from.tokenColumn;
        this.raw = from.raw;
        super.copyFrom(from);
    }

    private void copyTo(Scanner to) {
        to.token = this.token;
        to.tokenOffset = this.tokenOffset;
        to.tokenLine = this.tokenLine;
        to.tokenColumn = this.tokenColumn;
        to.raw = this.raw;
        super.copyTo(to);
    }

    @NotNull
    protected Token nextToken() {
        if (next == null) {
            this.token = Token.EMPTY;
            this.fetchToken();
        } else {
            if (this.prev != null) this.copyTo(this.prev);
            this.copyFrom(this.next);
            this.next.nextToken();
        }

        return this.token;
    }

    private void fetchToken() {
        this.refreshTokenOffset();
        char c = this.getCurrChar();
        this.buffer.setLength(0);
        this.appendChar();

        switch (c) {
            case '\u0000':
                this.token = Token.EOF;
                break;
            case ' ':
            case '\b':
            case '\t':
            case '\f':
            case '\n':
            case '\r':
                this.nextChar();
                this.fetchToken();
                break;
            case ',':
                this.token = Token.COMMA;
                this.nextChar();
                break;
            case ';':
                this.token = Token.SEMI;
                this.nextChar();
                break;
            case '=':
                this.token = Token.EQUALS;
                this.nextChar();
                break;
            default:
                if (c > '0' && c < '9') {
                    this.token = Token.INT;
                    this.nextChar();
                    this.getNumber();
                } else if (c == '_' || c == '$'
                        || (c >= 'a' && c <= 'z')
                        || (c >= 'A' && c <= 'Z')) {
                    this.token = Token.IDENTIFIER;
                    this.nextChar();
                    this.getIdentRest();
                } else {
                    throw newParsingException("Unexpected token");
                }
                break;
        }
    }

    private void getIdentRest() {
        char c = this.getCurrChar();
        if (c == '_' || c == '$'
                || (c >= 'a' && c <= 'z')
                || (c >= 'A' && c <= 'Z')
                || (c >= '0' && c <= '9')) {
            this.appendChar();
            this.nextChar();
            this.getIdentRest();
        } else {
            this.finishRaw();
            if (Keyword.matchRules(this.raw)) {
                Optional<Keyword> opt = Keyword.find(this.raw);
                if (opt.isPresent()) {
                    this.token = opt.get().getToken();
                } else {
                    throw newTokenParsingException(String.format("Unknown keyword \"%s\"", this.raw));
                }
            }
        }
    }

    private void getNumber() {
        char prev = this.getPrevChar();
        char curr = this.getCurrChar();
        Token token = this.getToken();

        switch (curr) {
            case '.':
                if (token == Token.DOUBLE) throw newParsingException("Unexpected token");
                this.token = Token.DOUBLE;
                this.appendChar();
                this.nextChar();
                this.getNumber();
                break;
            case 'f':
                if (prev > '9' || prev < '0') throw newParsingException("Unexpected token");
                this.token = Token.FLOAT;
                this.appendChar();
                this.finishRaw();
                this.nextChar();
                break;
            case 'l':
                if (token == Token.DOUBLE) throw newParsingException("Unexpected token");
                this.token = Token.LONG;
                this.appendChar();
                this.finishRaw();
                this.nextChar();
                break;
            default:
                if (curr >= '0' && curr <= '9') {
                    this.appendChar();
                    this.nextChar();
                    this.getNumber();
                } else if (prev > '9' || prev < '0') {
                    throw newParsingException("Unexpected token");
                } else {
                    this.finishRaw();
                }
        }
    }

    protected ParsingException newTokenParsingException(@NotNull String msg) {
        return new ParsingException(msg, this.tokenLine, this.tokenColumn);
    }

}
