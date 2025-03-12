import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String whatCalc = "";
        double number1 = 0;
        double number2 = 0;
        double results = 0;
        boolean moreCalcs = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I am a calculator, what type of math would you like me to do?" +
                           "\nI can do Addition (add), subtraction (sub), multiplication (mul) and division (div)");

        Mathing calculation = new Mathing();
        whatCalc = scanner.nextLine();

        while(moreCalcs) {
            calculation.numberSelection();
            number1 = calculation.num1;
            number2 = calculation.num2;
            if (whatCalc.equals("Add") || whatCalc.equals("add")) {
                results = Mathing.add(number1, number2);
                System.out.println(results);
            }else if (whatCalc.equals("Sub") || whatCalc.equals("sub")) {
                results = Mathing.sub(number1, number2);
                System.out.println(results);
            }else if (whatCalc.equals("Mul") || whatCalc.equals("mul")) {
                results = Mathing.mul(number1, number2);
                System.out.println(results);
            }else if (whatCalc.equals("Div") || whatCalc.equals("div")){
                results = Mathing.div(number1, number2);
                System.out.println(results);
            }else if(whatCalc.equals("Mod") || whatCalc.equals("mod")){
                results = Mathing.mod(number1, number2);
                System.out.println(results);
            }else {
                System.out.println("Please write a valid input (add, sub, mul, or div)");
            }
            System.out.println("Do you want to do another calculation? y/n");
            whatCalc = scanner.nextLine();
            if(!whatCalc.equals("y")){
                moreCalcs = false;
                System.out.println("Have a good day :)");
            }
        }

    }



}
