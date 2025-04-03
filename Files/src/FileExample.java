import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("./Files/data.txt");

        try (PrintWriter pw = new PrintWriter(file)){
            pw.println("Hej dette er en test");
            pw.println("Her er der en sætning");
            pw.println("Bruh");
        } catch (IOException e) {
            System.out.println("Oops");
        }

        try {
            Scanner s = new Scanner(file);
            while(s.hasNextLine()){
                String data = s.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
