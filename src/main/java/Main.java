import grammar.stringGrammarLexer;
import grammar.stringGrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.Visitor;

import java.io.*;

import static config.Config.compiledFileName;

public class Main {
    public static void main(String[] args) throws Exception {
        String sourceFileName = getSourceFileName(args);
        compileSource(sourceFileName);
        System.out.println("\n\n");
    }

    private static String getSourceFileName(String [] args) {
        String fileName = "";

        if (args.length == 1){
            fileName = args[0];
        } else {
            System.out.print("Not valid arg");
            System.exit(-1);
        }
        return fileName;
    }

    private static void compileSource(String sourceFileName) {
        stringGrammarLexer lexer = null;
        try {
            lexer = new stringGrammarLexer(new ANTLRFileStream(sourceFileName));
            stringGrammarParser parser = new stringGrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.parse();
            Visitor stringGrammarVisitor = new Visitor(sourceFileName);
            String output = stringGrammarVisitor.visit(tree);
            PrintWriter printer = null;
            printer = new PrintWriter(compiledFileName);
            printer.print(output);
            printer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}