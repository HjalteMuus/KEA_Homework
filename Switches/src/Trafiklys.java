import  java.util.Scanner;

public class Trafiklys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Er lyset rødt, gult eller grønt?");
        String input = scanner.nextLine();
        boolean sikkert = false;
        String krydsVejen = "";


        switch (input){
            case "rødt":
                sikkert = false;
                System.out.println("stop");
                break;
            case "gult":
                sikkert = false;
                System.out.println("vent");
                break;
            case "grønt":
                sikkert = true;
                System.out.println("gaa");
                break;
            default:
                break;
        }

        krydsVejen = (sikkert)? "Det er sikkert at krydse vejen" : "Det er ikke sikkert at krydse vejen";
        System.out.println(krydsVejen);
    }
}
