import com.lorentzos.pj.PJParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertEquals;

/**
 * Created by dionysis_lorentzos on 7/9/14.
 * Beware the dinosaurs!
 */
public class TestStatementsCommaless {

    final TreeCreator t = new TreeCreator() {
        @Override
        public ParseTree ruleListener(PJParser parser) {
            return parser.statementsCommaless();
        }
    };

    Matcher<String> test(String s){
        return equalToIgnoringWhiteSpace(t.testInput(s));
    }

    @Test
    public void testReturn() {
        String a = "return ;";
        Matcher<String> b = test("return \t");
        assertThat(a, b);
    }

    @Test
    public void testReturnVar() {
        String a = "return variable;";
        Matcher<String> b = test("return variable");
        assertThat(a, b);
    }

    @Test
    public void testThrow(){
        String a = "throw NullPointerExpression;";
        Matcher<String> b = test("throw NullPointerExpression");
        assertThat(a, b);
    }

    @Test
    public void testBreak() {
        assertThat("break ;", equalToIgnoringWhiteSpace(t.testInput("break \t")));
    }

    @Test
    public void testBreakVar() {
        String a = "break variable;";
        Matcher<String> b = equalToIgnoringWhiteSpace(t.testInput("break variable"));
        assertThat(a, b);
    }

    @Test
    public void testContinue() {
        String a = "continue ;";
        Matcher<String> b = equalToIgnoringWhiteSpace(t.testInput("continue \t"));
        assertThat(a, b);
    }

    @Test
    public void testContinueVar() {
        String a = "continue variable;";
        Matcher<String> b = equalToIgnoringWhiteSpace(t.testInput("continue variable"));
        assertThat(a, b);
    }

    @Test
    public void testAssertion() {
        String a = "assert this;";
        Matcher<String> b = equalToIgnoringWhiteSpace(t.testInput("assert this"));
        assertThat(a, b);
    }


}
