import  java.util.Scanner;

public class Clapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //print out the user input with emoji's
        System.out.println(input.replace(" ", "\uD83D\uDC4F"));
    }
}
