package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.*;
import dai.compiler.ast.PackageDeclaration;
import dai.compiler.ast.Statement;

import java.util.List;

public interface StatementVisitor extends BaseVisitor {

    default PackageDeclaration visitPackageDeclaration(PackageDeclarationContext ctx) {
        PackageDeclaration result = new PackageDeclaration();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        return result;
    }

    default ImportDeclaration visitImportDeclaration(ImportDeclarationContext ctx) {
        ImportDeclaration result = new ImportDeclaration();
        this.accept(ctx.identifierPath(), this::visitIdentifierPath, result::setName);
        return result;
    }

    default List<Statement> visitBody(BodyContext ctx) {
        return this.map(ctx.children, child -> {
            Object result = child.accept(this);
            return result instanceof Statement ? (Statement) result : (Statement) null;
        });
    }

    String visitIdentifierPath(IdentifierPathContext ctx);
}
