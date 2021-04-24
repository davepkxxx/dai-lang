package dai.compiler.parsing;

import com.fasterxml.jackson.databind.ObjectMapper;
import dai.compiler.syntax.Program;
import org.junit.jupiter.api.Test;

class ParserTest {

    @Test
    void parse() {
        try {
            Program program = new Parser("VAR id =1,name;").parse();
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(program);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}