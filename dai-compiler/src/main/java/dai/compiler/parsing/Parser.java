package dai.compiler.parsing;

import dai.compiler.syntax.BlockStatement;
import dai.compiler.syntax.SyntaxTreeNodePosition;
import dai.compiler.syntax.Program;
import dai.compiler.syntax.Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

public class Parser {

    private final String code;

    private final int length;

    private final ParsingCodePosition position;

    private final ParsingCodeStream stream;

    public Parser(String code) {
        this.code = code;
        this.length = code.length();
        this.position = new ParsingCodePosition(this.length);
        this.stream = new ParsingCodeStream(code, this.position);
    }

    public Program parse() {
        Program program = new Program();
        program.setBody(this.parseStatements(c -> true));
        this.position.setEndPosition(program);
        return program;
    }

    private Optional<Statement> parseStatement() {
        Statement stmt = null;
        char curr = this.getCurrentCharacter();

        if (curr == '{') {
            stmt = this.parseBlockStatement();
        }

        return Optional.ofNullable(stmt);
    }

    private List<Statement> parseStatements(Predicate<Character> predicate) {
        List<Statement> list = new ArrayList<>();

        this.stream.every(c -> {
            this.skipWhiteSpace(';');

            if (this.position.hasNext()) {
                this.parseStatement().ifPresent(stmt -> {
                    list.add(stmt);
                });
            }

            this.skipWhiteSpace(';');
            return predicate.test(c);
        });

        return list;
    }

    private BlockStatement parseBlockStatement() {
        BlockStatement block = new BlockStatement();
        this.position.setStartPosition(block);
        this.position.next();
        block.setBody(this.parseStatements(c -> c != '}'));
        this.position.next();
        return block;
    }

    private char getCurrentCharacter() {
        return code.charAt(this.position.getOffset());
    }

    private void skipWhiteSpace(char... others) {
        this.stream.every(c -> {
            switch (c) {
                case '\n': // enter
                case '\r': // carriage return
                    this.position.nextLine();
                case ' ': // space
                case '\t': // tab
                case '\f': // form feed
                    return true;
                default:
                    for (char o : others)
                        if (o == c)
                            return true;
                    return false;
            }
        });
    }

}
