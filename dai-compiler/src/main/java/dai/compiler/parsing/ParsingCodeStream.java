package dai.compiler.parsing;

import java.util.function.Predicate;

public class ParsingCodeStream {

    private final String code;

    private final ParsingCodePosition position;

    public ParsingCodeStream(String code, ParsingCodePosition position) {
        this.code = code;
        this.position = position;
    }

    public void every(Predicate<Character> predicate) {
        for (; this.position.hasNext(); this.position.next()) {
            char c = this.code.charAt(position.getOffset());
            if (!predicate.test(c)) break;
        }
    }

}
