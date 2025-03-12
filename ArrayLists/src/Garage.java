import java.util.*;

public class Garage {
    private ArrayList<Cars> garage = new ArrayList<>();

    public void addCar(Cars c){
        garage.add(c);
    }

    public int totalPrice(){
        int total = 0;
        for(Cars c : garage){
            total += c.getPrice();
        }
        return total;
    }
}



class Cars {
    private int price;
    public Cars(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Garage g = new Garage();
        Cars c1 = new Cars(2500);
        Cars c2 = new Cars(6000);
        Cars c3 = new Cars(16700);
        Cars c4 = new Cars(26850);

        g.addCar(c1);
        g.addCar(c2);
        g.addCar(c3);
        g.addCar(c4);

        System.out.println("What is the price of the new car you've added?");
        int price = s.nextInt();

        Cars c5 = new Cars(price);

        g.addCar(c5);

        int total = g.totalPrice();

        System.out.println(total);

    }
}