package dai.compiler.parsing;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

public enum Keyword {

    VAR("VAR", Token.VAR);

    private final String value;

    private final Token token;

    private Keyword(String value, Token token) {
        this.value = value;
        this.token = token;
    }

    public final String getValue() {
        return value;
    }

    public Token getToken() {
        return token;
    }

    private static final Map<String, Keyword> mapper = new HashMap<>();

    public static Optional<Keyword> find (String name) {
        Keyword keyword = Keyword.mapper.get(name);
        if (keyword != null) return Optional.of(keyword);

        for (Keyword k : Keyword.values()) {
            if (k.getValue().equals(name)) {
                Keyword.mapper.put(name, k);
                return Optional.of(k);
            }
        }

        return Optional.empty();
    }

    public static boolean matchRules(String name) {
        return Pattern.matches("^[A-Z]+$", name);
    }

}
