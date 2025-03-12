public class SnackAutomat {
    public static void main(String[] args){
        int paid = 93;
        int price = 0;

        int refund = buyItem(price, paid);

        int[] refundedCoins = refundCoins(refund);
        System.out.println("Number of 20 kr: " + refundedCoins[0] +
                "\nNumber of 10 kr: " + refundedCoins[1] +
                "\nNumber of 5 kr: " + refundedCoins[2] +
                "\nNumber of 2 kr: " + refundedCoins[3] +
                "\nNumber of 1 kr: " + refundedCoins[4]);
    }

    public static int buyItem(int price, int paid){
        if(!positive(price, paid)){
            System.out.println("Something went wrong");
            return -1;
        }
        if(enoughMoney(price, paid)){
            return paid - price;
        }
        System.out.println("Not enough money");
        return paid;
    }

    public static boolean enoughMoney(int price, int paid){
        if(price < paid){
            return true;
        }
        return false;
    }

    public static boolean positive(int price, int paid){
        if(price < 0 && paid < 0){
            System.out.println("Both are negative");
            return false;
        }else if(price < 0){
            System.out.println("Price is negative");
            return false;
        }else if(paid < 0){
            System.out.println("Paid amount is negative");
            return false;
        }
        return true;
    }

    public static int[] refundCoins(int refund){
        System.out.println("Amount to be refunded " + refund + " kr");
        int twenties = 0;
        int tens = 0;
        int fives = 0;
        int twos = 0;
        int ones = 0;
        int[] refundedCoins = new int[5];

        twenties = refund/20;
        refund = refund%20;
        tens = refund/10;
        refund = refund%10;
        fives = refund/5;
        refund = refund%5;
        twos = refund/2;
        refund = refund%2;
        ones = refund;

        refundedCoins[0] = twenties;
        refundedCoins[1] = tens;
        refundedCoins[2] = fives;
        refundedCoins[3] = twos;
        refundedCoins[4] = ones;

        return refundedCoins;
    }
}
