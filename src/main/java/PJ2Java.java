import com.lorentzos.pj.PJLexer;
import com.lorentzos.pj.PJParser;
import com.lorentzos.pj.Visitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 * Created by dionysis_lorentzos on 4/9/14.
 *
 */


public class PJ2Java {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }


        ANTLRInputStream input = new ANTLRInputStream(is);
        PJLexer lexer = new PJLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PJParser parser = new PJParser(tokens);
        parser.setBuildParseTree(true);

        ParserRuleContext tree = parser.pj();

        System.out.println(tree.toStringTree(parser));
        tree.inspect(parser);

        /*
        Case listener
         */
//        ParseTreeWalker walker = new ParseTreeWalker();
//        PJCompiler converter = new PJCompiler();
//        walker.walk(converter, tree);
//        System.out.println(converter.getValue(tree));


        /*
        Case com.lorentzos.pj.Visitor
         */
        Visitor loader = new Visitor();
        String result = loader.visit(tree);
        System.out.println(result);

    }


}