import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write an integer number for the pyramid height");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int i = height; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
