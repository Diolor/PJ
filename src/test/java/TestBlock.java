import com.lorentzos.pj.PJParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;

/**
 * Created by dionysis_lorentzos on 8/9/14.
 * Beware the dinosaurs!
 */
public class TestBlock {

    final TreeCreator t = new TreeCreator() {
        @Override
        public ParseTree ruleListener(PJParser parser) {
            return parser.statement();
        }
    };

    @Test
    public void testEmptyBlock() {
        assertThat("{\n\tyolo;\n}", equalToIgnoringWhiteSpace(t.testInput(":\n\tyolo")));
    }


}
