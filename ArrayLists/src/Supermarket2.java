import java.util.*;

public class Supermarket2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String inputItem = "";
        int inputNumber = 0;

        Vare milk = new Vare("Milk", 7);
        Vare bread = new Vare("Bread", 10);

        inputNumber = s.nextInt();
        OrderLine o = new OrderLine();
        int total = o.priceOf(inputNumber, milk);
        System.out.println(total);

    }
}

class Vare{
    private String item;
    private int price;

    public Vare(String item, int price){
        this.item = item;
        this.price = price;
    }

    public String getItem(){
        return item;
    }

    public void setItem(String newItem){
        item = newItem;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int newPrice){
        if(newPrice < 1){
            System.out.println("Price can't be less than 1");
            return;
        }
        price = newPrice;
    }

    public String toString(){
        String itemAndPrice;
        itemAndPrice = item + " " + price + "kr";
        return itemAndPrice;
    }
}

class OrderLine{
    public static OrderLine orderLine;
    public int priceOf(int number, Vare v){
        return number * v.getPrice();
    }
}
