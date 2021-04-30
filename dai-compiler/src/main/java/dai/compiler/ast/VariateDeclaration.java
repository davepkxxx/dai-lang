package dai.compiler.ast;

import android.support.annotation.IntDef;
import lombok.Data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

@Data
public class VariateDeclaration implements Statement {
    @VariateKind
    private int variateKind;
    private List<AnnotatedNode> annotations = new ArrayList<>();
    private List<VariateDeclarator> declarators = new ArrayList<>();

    @IntDef({VAR, CONST})
    @Retention(RetentionPolicy.SOURCE)
    public @interface VariateKind {
    }

    public static final int VAR = 0;
    public static final int CONST = 1;
}
