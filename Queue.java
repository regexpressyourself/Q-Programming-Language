import java.util.*;
import java.io.*;
public class Queue {
    public static void main(String[] args) {

        BufferedReader reader;
        StringBuilder  tempSource ;
        String         line;
        String         source;
        String[]       tokenArray;
        Parser         parser;

        source = "";

        /* Uncomment to allow user-input source file
        if (args.length != 1) {
            System.out.println ("Usage:   Queue [SOURCE_FILE]\n"    +
                                "example: Queue myfile.queue");
            System.exit(1);
        }
        */

        try {
            reader = new BufferedReader(new FileReader("source.queue"));
            // reader = new BufferedReader(new FileReader(args[0])); Uncomment to allow user-input source file
            tempSource = new StringBuilder();
            line       = reader.readLine();

            while (line != null) {
                tempSource.append(line);
                tempSource.append(System.lineSeparator());
                line = reader.readLine();
            }
            reader.close();
            source = tempSource.toString();
        }
        catch (FileNotFoundException e) {
            System.out.println ("FileNotFoundException: cannot find file" + args[1]);
            System.exit(1);
        }
        catch (IOException e) {
            System.out.println ("IOException on file read");
            System.exit(1);
        }

        parser = new Parser(source);
        tokenArray = parser.getTokens();

        for (String token : tokenArray) {
            System.out.printf("Next token is %s\n", token);
        }

        /*

          - Lexical Analysis -
          LexicalAnalyzer le = new LexicalAnalyzer(tokenArray);
          le.analyze();

          - Compiler -
          OurCompiler oc = new OurCompiler(tokenArray);
          new.run();

        */

    }

}