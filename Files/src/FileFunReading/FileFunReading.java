package FileFunReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileFunReading {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        File readMe = new File("./Files/src/FileFunReading/text.txt");
        try {
            Scanner s = new Scanner(readMe);
            while (s.hasNextLine()){
                String data = s.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
