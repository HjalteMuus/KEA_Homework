import java.util.Scanner;

public enum Supermarket {
    COCOA(20),
    MELON(45),
    OATS(14),
    BEEF(60);

    int price;

    Supermarket(int price){
        this.price = price;
    }
}

class Buying{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the supermarket, we have 4 things you can buy.\n" +
                           "Press 1 for cocoa, 2 for melon, 3 for oats, and 4 for beef");

        int input = s.nextInt();

        switch(input){
            case 1:
                System.out.println("The price of " + Supermarket.COCOA + " is " + Supermarket.COCOA.price);
                break;

            case 2:
                System.out.println("The price of " + Supermarket.MELON + " is " + Supermarket.MELON.price);
                break;

            case 3:
                System.out.println("The price of " + Supermarket.OATS + " is " + Supermarket.OATS.price);
                break;

            case 4:
                System.out.println("The price of " + Supermarket.BEEF + " is " + Supermarket.BEEF.price);
                break;

            default:
                break;
        }
    }
}