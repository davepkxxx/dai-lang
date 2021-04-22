package dai.compiler.parsing;

import com.fasterxml.jackson.databind.ObjectMapper;
import dai.compiler.syntax.Program;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void parse() {
        try {
            Program program = new Parser("var a = 1;\na++;").parse();
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(program);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}