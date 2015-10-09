package piglet;

import minijava.MJParser;
import minijava.MJScanner;

import java.io.*;

import minijava.*;

class Main {

  public static void main(String args[]) {

   if(args.length != 1) {
      System.err.println("FrontEnd: missing file command line argument");
      System.exit(1);
    }
    try {
      MJParser parser = new MJParser();

      // Start parsing from the nonterminal "Start".
      minijava.Program ast = (minijava.Program) parser.parse(new MJScanner(new FileReader(args[0])));
      // Print the resulting AST on standard output.

      System.out.println(ast.print().getString());
    }
    catch (FileNotFoundException e) {
      System.err.println("FrontEnd: file " + args[0] + " not found");
    }
    catch (beaver.Parser.Exception e) {
      System.out.println("Error when parsing: " + args[0]);      
      System.out.println(e.getMessage());      
    }
    catch (IOException e) {
      System.out.println("FrontEnd: " + e.getMessage());
    } 
  }

}
