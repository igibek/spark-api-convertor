//*
package spark;

import java.lang.StringBuffer;
import java.util.Map;
import java.util.HashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.*;
import spark.dataframe.*;
import spark.dataset.*;

public class App {
    private static String api = "";
    private static String transformed = "";

    public static void main(String[] args){
        if (args.length < 2) {
            printUsage();
            System.exit(1);
        }
        api = args[1];
        if (!(api.equals("dataframe") || api.equals("dataset"))) {
            System.out.print("> Unrecognized API: " + args[1] + "\n");
            printUsage();
            System.exit(1);
        }
        
        try {
            System.out.println("============\n> STARTED\n============");
            System.out.println("-- Filename: " + args[0]);
            System.out.println("-- Target api: " + api);
            String content = readFileAsString(args[0]);
            if (api.equals("dataframe")) {
                transformed = transformToDataframe(content);
            } else {
                transformed = transformToDataset(content);
            }
            String newFile = writeFile(args[0], transformed, args[1]);
            System.out.println("-- Original content: " + content);
            System.out.println("-- Final content: " + transformed);
            System.out.println("-- New file: " + newFile);
            System.out.println("============\n> FINISHED\n============");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    /**
    Private function which traverses and transform give Spark RDD API string
     */
    private static String transformToDataframe(String content) {
        // Get our lexer
        DataframeLexer lexer = new DataframeLexer(new ANTLRInputStream(content));
    
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
    
        // Pass the tokens to the parser
        DataframeParser parser = new DataframeParser(tokens);
    
        // Specify our entry point
        DataframeParser.ProgramContext programContext = parser.program();
        // parser.program();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        CustomDataframeListener listener = new CustomDataframeListener();
        walker.walk(listener, programContext);
        return listener.getResult();
    }

    private static String transformToDataset(String content) {
        // Get our lexer
        DatasetLexer lexer = new DatasetLexer(new ANTLRInputStream(content));
    
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
    
        // Pass the tokens to the parser
        DatasetParser parser = new DatasetParser(tokens);
    
        // Specify our entry point
        DatasetParser.ProgContext programContext = parser.prog();
        // parser.program();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        CustomDatasetListener listener = new CustomDatasetListener();
        walker.walk(listener, programContext);
        return listener.getResult();
    }

    /**
    Private function to read the contents of the file.
     */
    private static String readFileAsString(String fileName) throws Exception 
    { 
        String data = ""; 
        data = new String(Files.readAllBytes(Paths.get(fileName))); 
        return data; 
    } 
    /**
    Private function to create and write the data to the file
     */
    private static String writeFile(String filename, String data, String api) throws IOException {
        filename += "_" + api;
        Files.write(Paths.get(filename), data.getBytes());
        return filename;
    }

    /**
    Prints the usage of the program
     */
    private static void printUsage() {
        System.out.println("Usage:\n"
                        + "-- program <file> <api>.\n"
                        + "APIs:\n"
                        + "1. dataframe - converts specified file to Spark Dataframe API;\n"
                        + "2. dataset - converts specified file to Spark Dataset API");
    }
}