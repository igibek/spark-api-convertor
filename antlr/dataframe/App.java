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
import java.io.*;

public class App {
    
    public static void main(String[] args){
        if (args.length < 2) {
            printUsage();
            System.exit(1);
        } else if (!(args[1].equals("dataframe") || args[1].equals("dataset"))) {
            System.out.print("> Unrecognized API: " + args[1] + "\n");
            printUsage();
            System.exit(1);
        }
        
        try {
            String content = readFileAsString(args[0]);
            String transformed = transformToDataframe(content);
            System.out.println(transformed);
            writeFile(args[0], transformed, args[1]);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("FINISHED");
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
        ProgramContext programContext = parser.program();
        // parser.program();
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        CustomListener listener = new CustomListener();
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
        System.out.println("Content of file: " + data);
        return data; 
    } 
    /**
    Private function to create and write the data to the file
     */
    private static void writeFile(String filename, String data, String api) throws IOException {
        filename += "_" + api;
        Files.write(Paths.get(filename), data.getBytes());
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