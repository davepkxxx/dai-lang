package dai.compiler.parsing;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.json.JsonMapper;
import dai.compiler.antlr.DaiLexer;
import dai.compiler.antlr.DaiParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ParserVisitorTest {

    private ParserVisitor visitor;

    private JsonMapper json;

    @BeforeEach
    void setUp() {
        this.visitor = new ParserVisitor();
        this.json = new JsonMapper();
        this.json.setSerializationInclusion(Include.NON_EMPTY);
    }

    @Test
    void visitCompilationUnit() throws IOException {
        String filename = this.getClass().getResource("/test.dai").getFile().substring(1);
        DaiParser parser = new DaiParser(new CommonTokenStream(new DaiLexer(CharStreams.fromFileName(filename))));
        Object result = this.visitor.visit(parser.compilationUnit());
        System.out.println(json.writeValueAsString(result));
    }
}