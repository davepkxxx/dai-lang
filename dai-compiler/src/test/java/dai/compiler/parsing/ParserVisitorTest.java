package dai.compiler.parsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import dai.compiler.antlr.DaiLexer;
import dai.compiler.antlr.DaiParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParserVisitorTest {

    private ParserVisitor visitor;

    @BeforeEach
    void setUp() {
        this.visitor = new ParserVisitor();
    }

    @Test
    void visitCompilationUnit() throws JsonProcessingException {
        String s = "VAR i: java.util.Int = 0;";
        DaiParser parser = new DaiParser(new CommonTokenStream(new DaiLexer(CharStreams.fromString(s))));
        Object obj = this.visitor.visit(parser.compilationUnit());
        System.out.println(new JsonMapper().writeValueAsString(obj));
    }
}