import java.util.Scanner;

public class InchToCentimeter {
    public static void main(String[] args) {
        final double inch = 2.54;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, and welcome to the inch to centimeter calculator." +
                "\nPlease write the amount of inches you would like to convert into centimeters." +
                "\nRemember that to write in decimal inches you have to use ',' and not '.'." +
                "\nCorrect example: '1,9'  Incorrect example: '1.9'");
        double inputInches = scanner.nextDouble();
        double centimeters = inch*inputInches;
        System.out.println("You wanted to convert " + inputInches + " inches and it is " + centimeters +
                           " centimeters");
    }
}
