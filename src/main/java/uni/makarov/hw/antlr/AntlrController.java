package uni.makarov.hw.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.GrammarLexer;
import parser.GrammarParser;

public class AntlrController {
    AntlrController(){}

   String receiveText(String text){
        return parse(text);
   }

   String parse(String string) {
       CharStream input = CharStreams.fromString(string);
       GrammarLexer lexer = new GrammarLexer(input);
       CommonTokenStream tokens = new CommonTokenStream(lexer);
       GrammarParser parser = new GrammarParser(tokens);

       ParseTree tree = parser.parse();

       GrammarVisitor visitor = new GrammarVisitor();
       String result = String.valueOf(visitor.visit(tree));

       System.out.println(tree.toStringTree(parser));
       System.out.println(result);

       return result;
   }
}