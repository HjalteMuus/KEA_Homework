import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("./output.txt");

        try (PrintWriter pw = new PrintWriter(file)){
            pw.println("Hejsa");
        } catch (IOException e) {
            System.out.println("Oops");
        }
    }
}
