import java.util.Scanner;

enum Farver{
    RED,
    GREEN,
    BLUE
}

class SelectColor{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Please select a color: 1 for RED, 2 for GREEN, 3 for BLUE");

        int input = s.nextInt();

        switch (input){
            case 1:
                System.out.println("You selected " + Farver.RED);
                break;

            case 2:
                System.out.println("You selected " + Farver.GREEN);
                break;

            case 3:
                System.out.println("You selected " + Farver.BLUE);
                break;

            default:
                break;
        }
    }
}