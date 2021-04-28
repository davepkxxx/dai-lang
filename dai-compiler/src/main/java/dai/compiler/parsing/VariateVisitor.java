package dai.compiler.parsing;

import dai.compiler.antlr.DaiParser.*;
import dai.compiler.ast.ClassType;
import dai.compiler.ast.VariateDeclaration;
import dai.compiler.ast.VariateDeclarator;

import java.util.List;

public interface VariateVisitor extends BaseVisitor {

    default VariateDeclaration visitVariateDeclaration(VariateDeclarationContext ctx) {
        VariateDeclaration result = new VariateDeclaration();
        if (ctx.VAR() != null) result.setKind(VariateDeclaration.Kind.VAR);
        if (ctx.CONST() != null) result.setKind(VariateDeclaration.Kind.CONST);
        result.getDeclarators().addAll(this.visitVariateDeclaratorList(ctx.variateDeclaratorList()));
        return result;
    }

    default List<VariateDeclarator> visitVariateDeclaratorList(VariateDeclaratorListContext ctx) {
        return map(ctx.variateDeclarator(), this::visitVariateDeclarator);
    }

    default VariateDeclarator visitVariateDeclarator(VariateDeclaratorContext ctx) {
        VariateDeclarator result = new VariateDeclarator();
        this.accept(ctx.identifier(), this::visitIdentifier, result::setName);
        this.accept(ctx.classType(), this::visitClassType, result::setType);
        return result;
    }

    String visitIdentifier(IdentifierContext ctx);

    ClassType visitClassType(ClassTypeContext ctx);
}
