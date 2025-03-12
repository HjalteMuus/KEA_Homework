import java.util.Scanner;

public class userInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your name");
        String userName = scanner.nextLine();

        System.out.println("Please write what your favorite color is");
        String userColor = scanner.nextLine();

        System.out.println("Your name is " + userName + " and your favorite color is " + userColor);
    }
}
