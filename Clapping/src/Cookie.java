import java.util.Scanner;

public class Cookie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cookies do you want to bake (please stick to a whole number)");
        int cookieAmount = scanner.nextInt();

        int flourPerCookie = 10;

        int flourTotal = cookieAmount * flourPerCookie;

        System.out.println("You will need " + flourTotal + " grams of flour");
    }
}
