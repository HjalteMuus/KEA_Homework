import java.util.Scanner;

public class Terningspil {
    static Terning dice1 = new Terning();
    static Terning dice2 = new Terning();
    static int counter = 0;
    static boolean playing = true;
    static Scanner scan = new Scanner(System.in);
    static String input;

    public static void main(String[] args) {
        play();
    }

    public static void play(){
        confirm();
        while(playing){
            rollDice();
            counter++;
            System.out.println("You rolled " + dice1.faceValue + " and " + dice2.faceValue);
            if (dice1.faceValue == 1 && dice2.faceValue == 1) {
                System.out.println("Snake Eyes!! You WIN!!! You rolled " + counter + " times");
                break;
            }
            rollAgain(scan);
        }
    }

    public static void rollDice(){
        dice1.roll();
        dice2.roll();
    }

    public static void rollAgain(Scanner scan){
        System.out.println("Do you want to roll again? Y or y for yes, any other input for no");
        input = scan.nextLine();
        if(!input.equalsIgnoreCase("Y")){
            System.out.println("Thanks for playing :)");
            playing = false;
        }
    }

    public static void confirm(){
        System.out.println("Do you wanna play Snake Eyes? Y or y for yes, any other input for no");
        input = scan.nextLine();
        if(!input.equalsIgnoreCase("Y")){
            System.out.println("Well hope you have a good day");
            playing = false;
        }
    }
}
