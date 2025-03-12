import java.util.Scanner;

public class Portoberegner {


    public static void main(String[] args) {
        int lightweightPrice = 29;
        int mediumweightPrice = 58;
        int heavyweightPrice = 87;
        boolean sendable = true;
        String sent = "";

        int price = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the weight of your letter in whole grams");

        int weight = scanner.nextInt();

        if(weight > 0 && weight <= 100) {
            price = lightweightPrice;
        } else if(weight > 100 && weight <= 250){
            price = mediumweightPrice;
        } else if(weight > 250 && weight <= 2000){
            price = heavyweightPrice;
        } else {
            sendable = false;
        }

        sent = (sendable)? "The price of your letter is " + price : "We cannot send a letter with this weight";
        System.out.println(sent);
    }
}
