package com.lorentzos.pj;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.io.FilenameUtils;

import java.io.*;

/**
 * Created by dionysis_lorentzos on 10/9/14.
 * Beware the dinosaurs!
 */
public class PJCompiler {


    private static String inputFile;
    private static boolean compile = false;
    private static boolean haspath = false;
    private static boolean delete = false;
    private static String path;

    public PJCompiler() throws IOException, InterruptedException {


        String name = FilenameUtils.getBaseName(inputFile);
        String ext = FilenameUtils.getExtension(inputFile);

        if(!ext.toLowerCase().equals("pj")){
            System.out.println("Please support a .pj file.");
            return;
        }

        if(!haspath) {
            path = FilenameUtils.getFullPath(inputFile);
        }
        File temp = new File( path+name+".java" );




        InputStream is =new FileInputStream(inputFile);
        String result =  parseTree(is);
        //System.out.println(result);



        Writer bw = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(temp) , "utf-8"));
        bw.write(result);
        bw.close();

        if(compile | delete) {
            Process proc = Runtime.getRuntime().exec("javac " + temp.getAbsolutePath());
            printErrors(proc);
        }
        if(delete) {
            temp.deleteOnExit();
        }

    }


    private String parseTree(InputStream is) throws IOException {

        ANTLRInputStream input = new ANTLRInputStream(is);
        PJLexer lexer = new PJLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PJParser parser = new PJParser(tokens);
        parser.setBuildParseTree(true);
        ParserRuleContext tree = parser.pj();


        Visitor loader = new Visitor();
        return loader.visit(tree);
    }

    private void printErrors(Process proc) throws IOException {
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

        // read the output from the command
        String s ;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        // read any errors from the attempted command
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }



    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length == 0) {
            System.out.println("Use like: PJ <file> [-options]\n"+
                    "where options include:\n"+
                    "  -c | -compile\n"+
                    "      To generate .java files and compile them.\n"+
                    "  -cd\n"+
                    "      To compile but not generate .java files.\n"+
                    "  -o: outputpath\n"+
                    "      To specify the output path.\n"
            );
            return;
        }

        int i=0;
        inputFile = args[0];
        i++;
        while ( i<args.length ) {
            String arg = args[i];
            if ( arg.equals("-o") ) {
                haspath = true;
                i++;
                path = args[i];
                if(!new File(path).isDirectory())
                    System.out.println("Not a valid directory given.");
            }
            if( arg.equals("-c") || arg.equals("-compile") ){
                compile = true;
            }
            if( arg.equals("-cd")){
                delete = true;
            }
            i++;
        }
        new PJCompiler();
    }



}
