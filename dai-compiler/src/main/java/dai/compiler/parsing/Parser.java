package dai.compiler.parsing;

import dai.compiler.syntax.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
        stmt.setId(this.identifier());
        stmt.setPos(stmt.getId().getPos());
        this.setEndPos(stmt);
        return stmt;
    }

    private Identifier identifier() {
        Identifier id = new Identifier();

        if (this.nextToken() == Token.IDENTIFIER) {
            id.setPos(this.newTokenPos());
            id.setName(this.getName());
            this.setEndPos(id);
            return id;
        } else {
            throw newTokenParsingException("Unexpected token");
        }
    }

}
