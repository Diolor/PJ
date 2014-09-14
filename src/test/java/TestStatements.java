import com.lorentzos.pj.PJParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;



/**
 * Created by dionysis_lorentzos on 8/9/14.
 * Beware the dinosaurs!
 */
public class TestStatements {

    final TreeCreator t = new TreeCreator() {
        @Override
        public ParseTree ruleListener(PJParser parser) {
            return parser.statement();
        }
    };

    Matcher<String> test(String s){
        return equalToIgnoringWhiteSpace(t.testInput(s));
    }

    @Test
    public void testTryStament() {

        String a = "try{\n\tyolo;\n}\ncatch(ExceptionType name){\n\tpass;\n}";

        Matcher<String> b = test("try:\n\tyolo\ncatch ExceptionType name:\n\tpass"  );

        assertThat(a, b);
    }


}


