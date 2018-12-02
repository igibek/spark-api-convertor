//*
package dataframe;

import java.lang.StringBuffer;
import java.util.Map;
import java.util.HashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import dataframe.DataframeParser.ProgramContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
//*/

public class App {
    //*
    private static void traverse(String content) {
        // Get our lexer
        DataframeLexer lexer = new DataframeLexer(new ANTLRInputStream(content));
    
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
    
        // Pass the tokens to the parser
        DataframeParser parser = new DataframeParser(tokens);
    
        // Specify our entry point
        ProgramContext programContext = parser.program();
        // parser.program();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        CustomListener listener = new CustomListener();
        walker.walk(listener, programContext);
        System.out.println(listener.getResult());
    }
    //*/
    public static void main(String[] args){
        traverse("sc.range(10,100).map(i => { val j = i%3; (i, if (j==0) i*10 else i*2)}).map(r => (r._1 + r._2 - r._3) * r._4).collect()");
        System.out.println("FINISHED");
    }
}