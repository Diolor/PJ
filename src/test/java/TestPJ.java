import com.lorentzos.pj.PJParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.hamcrest.Matcher;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertEquals;

/**
 * Created by dionysis_lorentzos on 6/9/14.
 * Beware the dinosaurs!
 */
public class TestPJ {

    final TreeCreator t = new TreeCreator() {
        @Override
        public ParseTree ruleListener(PJParser parser) {
            return parser.pj();
        }
    };

    Matcher<String> test(String s){
        return equalToIgnoringWhiteSpace(t.testInput(s));
    }

    @Test
    public void testPackage() throws Exception{
        String a = "package com.lorentzos;\n";
        Matcher<String> b = test("package com.lorentzos");
        assertThat(a, b);
    }

    @Test
    public void testImport() {
        assertEquals( "import com.lorentzos;\n", t.testInput("import com.lorentzos"));
    }

    @Test
    public void testBothPackageAndImport() {
        String a = "package com.lorentzos;\n\nimport com.lorentzos;\n";

        Matcher<String> b = equalToIgnoringWhiteSpace(t.testInput("package com.lorentzos\nimport com.lorentzos"));
        assertThat(a, b);
    }

    @Test
    @Ignore
    public void testBothPackageAndImportWithNewLine() {
        assertEquals( "package com.lorentzos;\nimport com.lorentzos;\n", t.testInput("package com.lorentzos\nimport com.lorentzos\n"));
    }

    @Test
    @Ignore
    public void testBothPackageAndImportWithTwoNewLine() {
        assertEquals( "package com.lorentzos;\nimport com.lorentzos;\n", t.testInput("package com.lorentzos\nimport com.lorentzos\n\n\n\n"));
    }

}
