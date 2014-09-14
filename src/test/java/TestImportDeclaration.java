import com.lorentzos.pj.PJParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dionysis_lorentzos on 6/9/14.
 * Beware the dinosaurs!
 */
public class TestImportDeclaration {

    final TreeCreator tree = new TreeCreator() {
        @Override
        public ParseTree ruleListener(PJParser parser) {
            return parser.importDeclaration();
        }
    };


    @Test
    public void testPackageDeclaration() {
        String assertion    = "import com.lorentzos;\n";
        String result       = tree.testInput("import com.lorentzos");
        assertEquals( assertion, result);
    }


    @Test
    public void testStatic(){
        assertEquals("import static java.util;\n",tree.testInput("import static java.util"));
    }

    @Test
    public void testImportAll(){
        assertEquals("import java.*;\n",tree.testInput("import java.*"));
    }


}
