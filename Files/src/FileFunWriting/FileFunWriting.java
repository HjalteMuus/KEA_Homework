package FileFunWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileFunWriting {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        File file = new File("./Files/output.txt");

        try {
            PrintStream ps = new PrintStream(file);
            ps.println("Hello?");
            ps.println("Why are we here? Just to suffer?");
            ps.println();
            ps.println("Yes. Yes we are...");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }


    }
}
