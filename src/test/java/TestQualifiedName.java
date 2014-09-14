import com.lorentzos.pj.PJParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dionysis_lorentzos on 6/9/14.
 * Beware the dinosaurs!
 */
public class TestQualifiedName {

    final TreeCreator tree = new TreeCreator() {
        @Override
        public ParseTree ruleListener(PJParser parser) {
            return parser.qualifiedName();
        }
    };


    @Test
    public void testPackageDeclaration(){

        String result       = tree.testInput("com.lorentzos");

        assertEquals("com.lorentzos", result);
    }


}
