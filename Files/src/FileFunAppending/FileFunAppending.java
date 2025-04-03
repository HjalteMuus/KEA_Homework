package FileFunAppending;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileFunAppending {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        try {
            FileOutputStream fos = new FileOutputStream("./Files/src/FileFunAppending/output.txt", true);
            PrintStream ps = new PrintStream(fos);
            ps.println("Adding line 4");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
