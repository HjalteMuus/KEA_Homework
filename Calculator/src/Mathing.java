import java.util.Scanner;

public class Mathing {
    static double sum;
    double num1;
    double num2;
    Scanner scanner = new Scanner(System.in);


    public void numberSelection(){
        System.out.println("Please write the first number");
        num1 = scanner.nextDouble();
        System.out.println("Please write the second number");
        num2 = scanner.nextDouble();
    }

    public static double add (double num1, double num2){
        return  sum = num1 + num2;
    }

    public static double sub(double num1, double num2){
        return sum = num1 - num2;
    }

    public static double mul(double num1, double num2){
        return sum = num1 * num2;
    }

    public static double div(double num1, double num2){
        if(num2 != 0){
            sum = num1 / num2;
            return sum;
        }else {
            System.out.println("Division by 0 is not allowed");
            return 0;
        }
    }

    public static double mod(double num1, double num2){
        return num1 % num2;
    }
}
