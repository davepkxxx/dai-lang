package dai.compiler.parsing;

import dai.compiler.syntax.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Parser extends Scanner {

    public Parser(String code) {
        super(code);
        this.init();
    }

    public Program parse() {
        Program program = new Program();
        program.setPos(this.newPos());
        program.setBody(this.statements(c -> true));
        this.setEndPos(program);
        return program;
    }

    private List<Statement> statements(Predicate<Character> predicate) {
        List<Statement> list = new ArrayList<>();

        for (Token token = this.nextToken(); token != Token.EOF; token = this.nextToken()) {
            if (token == Token.SEMI) continue;
            list.add(statement());
        }

        return list;
    }

    private Statement statement() {
        switch (this.getToken()) {
            case VAR:
                return variableDeclaration();
        }

        throw newTokenParsingException("Unexpected token");
    }

    private Statement variableDeclaration() {
        VariableDeclaration stmt = new VariableDeclaration();
        stmt.setPos(this.newTokenPos());
        stmt.setKind(VariableDeclarationKind.VAR);
        stmt.setDeclarators(new ArrayList<>());

        do {
            stmt.getDeclarators().add(variableDeclarator());
        } while (this.nextToken() == Token.COMMA);

        switch (this.getToken()) {
            case SEMI:
                this.setEndPos(stmt);
                return stmt;
            case EOF:
                throw newTokenParsingException("reached end of file while parsing");
            default:
                throw newTokenParsingException("';' expected");
        }
    }

    private VariableDeclarator variableDeclarator() {
        VariableDeclarator stmt = new VariableDeclarator();
        stmt.setPos(this.getNext().newTokenPos());
        stmt.setId(this.identifier());

        if (this.getNext().getToken() == Token.EQUALS) {
            this.nextToken();
            stmt.setInit(this.expression());
        }

        this.setEndPos(stmt);
        return stmt;
    }

    private Identifier identifier() {
        Identifier id = new Identifier();

        if (this.nextToken() == Token.IDENTIFIER) {
            id.setPos(this.newTokenPos());
            id.setName(this.getRaw());
            this.setEndPos(id);
            return id;
        } else {
            throw newTokenParsingException("Unexpected token");
        }
    }

    private Expression expression() {
        switch (this.nextToken()) {
            case INT:
                return literal();
            default:
                throw newTokenParsingException("Unexpected token");
        }
    }

    private Literal literal() {
        switch (this.getToken()) {
            case INT:
                return new IntLiteral(this.getRaw());
            default:
                throw newTokenParsingException("Unexpected token");
        }
    }

}
