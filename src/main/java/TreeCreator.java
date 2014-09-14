import com.lorentzos.pj.PJLexer;
import com.lorentzos.pj.PJParser;
import com.lorentzos.pj.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by dionysis_lorentzos on 6/9/14.
 * Beware the dinosaurs!
 */

public abstract class TreeCreator {

    public String testInput(String input) {
        InputStream is = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream stream = null;
        try {
            stream = new ANTLRInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PJLexer lexer = new PJLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PJParser parser = new PJParser(tokens);
        parser.setBuildParseTree(true);                  // tell ANTLR to build a parse tree
        ParseTree tree = this.ruleListener(parser);

//        ParseTreeWalker walker = new ParseTreeWalker();
//        PJCompiler converter = new PJCompiler();
//        walker.walk(converter, tree);
//        return converter.getValue(tree);

        Visitor loader = new Visitor();
        return loader.visit(tree);

    }

    public abstract ParseTree ruleListener(PJParser parser);

}
