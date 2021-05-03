package dai.compiler.parsing;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.json.JsonMapper;
import dai.compiler.antlr.DaiLexer;
import dai.compiler.antlr.DaiParser;
import dai.compiler.ast.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ParserVisitorTest {

    private ParserVisitor visitor;

    private JsonMapper json;

    DaiParser newDaiParser(String code) {
        return new DaiParser(new CommonTokenStream(new DaiLexer(CharStreams.fromString(code))));
    }

    Object visit(String code, String methodName) {
        try {
            DaiParser parser = this.newDaiParser(code);
            Object node = DaiParser.class.getMethod(methodName).invoke(parser);
            return this.visitor.visit((ParseTree) node);
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }

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

    @Test
    void visitPackageDeclaration() {
        // error code
        Object result = this.visit("", "packageDeclaration");
        assertThat(result, is(nullValue()));
        // normal code
        String name = "dai.compiler.parsing";
        String code = "PACKAGE " + name;
        result = this.visit(code, "packageDeclaration");
        assertThat(result, instanceOf(PackageDeclaration.class));
        PackageDeclaration node = (PackageDeclaration) result;
        assertThat(node.getName(), equalTo(name));
    }

    @Test
    void visitImportDeclaration() {
        // error code
        Object result = this.visit("", "importDeclaration");
        assertThat(result, is(nullValue()));
        // normal code
        String name = "java.util.List";
        String code = "IMPORT " + name;
        result = this.visit(code, "importDeclaration");
        assertThat(result, instanceOf(ImportDeclaration.class));
        ImportDeclaration node = (ImportDeclaration) result;
        assertThat(node.getName(), equalTo(name));
    }

    @Test
    void visitStatement() {
        assertThat(this.visit("", "stmt"), is(nullValue()));
    }

    @Test
    void visitEmptyStatement() {
        String code = ";";
        Object result = this.visit(code, "stmt");
        assertThat(result, instanceOf(EmptyStatement.class));
    }

    @Test
    void visitContinueStatement() {
        String code = "CONTINUE";
        Object result = this.visit(code, "stmt");
        assertThat(result, instanceOf(ContinueStatement.class));
    }

    @Test
    void visitBreakStatement() {
        String code = "BREAK";
        Object result = this.visit(code, "stmt");
        assertThat(result, instanceOf(BreakStatement.class));
    }

    @Test
    void visitReturnStatement() {
        // no return value
        String code = "RETURN";
        Object result = this.visit(code, "stmt");
        assertThat(result, instanceOf(ReturnStatement.class));
        ReturnStatement stmt = (ReturnStatement) result;
        assertThat(stmt.getExpression(), is(nullValue()));
        // return value
        String retval = "result";
        code = "RETURN " + retval;
        result = this.visit(code, "stmt");
        assertThat(result, instanceOf(ReturnStatement.class));
        stmt = (ReturnStatement) result;
        assertThat(stmt.getExpression(), instanceOf(IdentifierExpression.class));
        IdentifierExpression expr = (IdentifierExpression) stmt.getExpression();
        assertThat(expr.getName(), equalTo(retval));
    }
}