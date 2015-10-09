package minijava;

import java.io.*;

class MJFrontEnd {

  public static void main(String args[]) {
   String inputFileName;
   if(args.length != 1) {
//      System.out.println("MJFrontEnd: missing file command line argument");
      //System.exit(1);
//      inputFileName = "tests/carFrigge/MainTest.java";
//      inputFileName = "tests/carFrigge/MainTestForLookup.java";
//      inputFileName = "tests/carFrigge/MainTestForType.java";
//	    inputFileName = "tests/carFrigge/MainTestForPiglet.java";
//      inputFileName = "tests/carFrigge/MainTestForPigletWithClassDecl.java";
//     inputFileName = "tests/carFrigge/MainTestForPigletWithMultipleClassDecls.java";
//	     inputFileName = "tests/carFrigge/MainTestForKangaSpill.java";
//	     inputFileName = "tests/carFrigge/MainTestForKangaParameter.java";
//      inputFileName = "tests/carFrigge/MainTestForPigletArray.java";
//	   inputFileName = "tests/Hauke/factorial.java";
//	   inputFileName = "tests/Hauke/TreeVisitor.java";
//	   inputFileName = "tests/Hauke/QuickSort.java";
//	   inputFileName = "tests/Hauke/BubbleSort.java";
//	   inputFileName = "tests/Hauke/MoreThan4.java";
//	   inputFileName = "tests/Hauke/LinkedList.java";
//	   inputFileName = "tests/carFrigge/ArrayList.java";
//	   inputFileName = "tests/carFrigge/InnerIf3.java";
//	   inputFileName = "tests/carFrigge/LinearSearch2.java";
//	    inputFileName = "tests/carFrigge/MT.java";
//	    inputFileName = "tests/carFrigge/NullTest.java";
//	    inputFileName = "tests/carFrigge/MultCheck1.java";
//	    inputFileName = "tests/carFrigge/MultCheck2.java";
	    inputFileName = "tests/carFrigge/MultCheck3.java";
    }
   else {
      System.out.println("MJFrontEnd: starting on file " + args[0]);
      System.out.flush();
      inputFileName = args[0];
    }
   try {
      MJParser parser = new MJParser();

      Program ast = (Program) parser.parse(new MJScanner(new FileReader(inputFileName)));
       
    /*  Set<Error> typeErrors = ast.getTypeErrors();
      if (!typeErrors.isEmpty()) {
    	  System.out.println("There are " + typeErrors.size() + " type error(s) in "+ args[0]);
    	  for (Error e : typeErrors) {
    		 System.out.println(e.getMessage());
    	  }
    	  System.exit(1);
      }
      */
      // Print the resulting AST on standard output.
//      System.out.println(ast.print().getString()); 
//      System.out.println(ast.validate().size()); 
      ast.check();
//      System.out.println("Anzahl der Fehler: "+ast.error().size());
      for (CompilationError error : ast.error()) {
    	  System.out.println(error.getReason());
      }
      if(ast.error().isEmpty()){
//	      System.out.println("");
//	      System.out.println("Piglet: ");
    	  piglet.Program piglet = ast.toPiglet();
//	      System.out.println(piglet.print().getString());
    	  spiglet.Program spiglet = piglet.toSpiglet();
//    	  System.out.println(spiglet.print().getString());
    	  kanga.Program kanga = spiglet.toKanga();
//    	  System.out.println(kanga.print().getString());
//    	  kanga.execute();
    	  mips.Program mips = kanga.toMips();
    	  System.out.println(mips.print());
//    	  mips.execute();
      }
    }
    catch (FileNotFoundException e) {
      System.err.println("MJFrontEnd: file " + inputFileName + " not found");
    }
    catch (beaver.Parser.Exception e) {
      System.out.println("Error when parsing: " + inputFileName);      
      System.out.println(e.getMessage());      
    }
    catch (IOException e) {
      System.out.println("MJFrontEnd: " + e.getMessage());
    }
  }

}
