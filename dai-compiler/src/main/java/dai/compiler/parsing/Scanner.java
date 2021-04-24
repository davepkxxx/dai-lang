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

    @Nullable
    private String raw;

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

    protected String getRaw() {
        return raw;
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
        this.buffer.append(c);

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
                this.buffer.append(c);
                this.nextChar();
                break;
            case ';':
                this.token = Token.SEMI;
                this.buffer.append(c);
                this.nextChar();
                break;
            case '=':
                this.token = Token.EQUALS;
                this.buffer.append(c);
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
            this.buffer.append(c);
            this.nextChar();
            this.getIdentRest();
        } else {
            this.raw = this.buffer.toString();
            if (Keyword.matchRules(raw)) {
                Optional<Keyword> opt = Keyword.find(raw);
                if (opt.isPresent()) {
                    this.token = opt.get().getToken();
                } else {
                    throw newTokenParsingException(String.format("Unknown keyword \"%s\"", this.raw));
                }
            }
        }
    }

    private void getNumber() {
        char c = this.getCurrChar();
        if (c > '0' && c < '9') {
            this.buffer.append(c);
            this.nextChar();
            this.getNumber();
        } else {
            this.raw = this.buffer.toString();
        }
    }

    protected ParsingException newTokenParsingException(@NotNull String msg) {
        return new ParsingException(msg, this.tokenLine, this.tokenColumn);
    }

}
