package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser;
import dai.compiler.ast.*;
import dai.compiler.ast.Package;

public class ParserVisitor extends BaseParserVisitor {

    @Override
    public CompilationUnit visitCompilationUnit(DaiParser.CompilationUnitContext ctx) {
        CompilationUnit result = new CompilationUnit();
        this.visitChildren(ctx, child -> {
            if (child instanceof Package) result.setPkg((Package) child);
            if (child instanceof Statement) result.getBody().add((Statement) child);
        });
        return result;
    }

    @Override
    public VariateDeclaration visitVariateDeclaration(DaiParser.VariateDeclarationContext ctx) {
        VariateDeclaration result = new VariateDeclaration();
        if (ctx.VAR() != null) result.setKind(VariateDeclaration.Kind.VAR);
        if (ctx.CONST() != null) result.setKind(VariateDeclaration.Kind.CONST);
        this.visitChildren(ctx, child -> {
            if (child instanceof VariateDeclarator) result.getDeclarators().add((VariateDeclarator) child);
        });
        return result;
    }

    @Override
    public VariateDeclarator visitVariateDeclarator(DaiParser.VariateDeclaratorContext ctx) {
        VariateDeclarator result = new VariateDeclarator();
        result.setName(ctx.IDENTIFIER().getText());
        this.visitChildren(ctx, child -> {
            if (child instanceof ClassType) result.setType((ClassType) child);
            if (child instanceof Expression) result.setInit((Expression) child);
        });
        return result;
    }

    @Override
    public AstNode visitClassType(DaiParser.ClassTypeContext ctx) {
        ClassType result = new ClassType();
        result.setName(ctx.qualifiedName().getText());
        this.visitChildren(ctx, child -> {
            if (child instanceof ClassType) result.getGenericsParameters().add((ClassType) child);
        });
        return result;
    }
}
