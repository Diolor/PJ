import com.lorentzos.pj.PJParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;

/**
 * Created by dionysis_lorentzos on 9/9/14.
 * Beware the dinosaurs!
 */
public class TestClass {

    final TreeCreator t = new TreeCreator() {
        @Override
        public ParseTree ruleListener(PJParser parser) {
            return parser.classDeclaration();
        }
    };

    @Test
    public void testEmptyClass() {
        String a = "class Test{\n\n}";
        Matcher<String> b = equalToIgnoringWhiteSpace(t.testInput("class Test:"));
        assertThat(a, b);
    }


    @Test
    public void testEmptyClassWithTrailedNL() {
        String a = "class Test{\n\n}";
        Matcher<String> b = equalToIgnoringWhiteSpace(t.testInput("class Test:\n"));
        assertThat(a, b);
    }


}
