public class Cykel {
    private String color;
    private double kms; //kilometers
    private int wheels;
    private double price;

    public Cykel(String color, double kms, double price, int wheels){
        this.color = color;
        this.wheels = wheels;
        this.price = price;
        this.kms = kms;
    }

    public double newPrice(){
        return price;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public int getWheels(){
        return wheels;
    }

    public void setWheels(int newWheels){
        if(newWheels < 1){
            System.out.println("A bike needs at least 1 wheel");
        }
        wheels = newWheels;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double updatePrice){
        if(updatePrice < 0){
            System.out.println("We don't give people money to get our bikes");
            return;
        }
        this.price = updatePrice;
    }

    public double getKms(){
        return kms;
    }

    public void setKms(double updateKms){
        if(updateKms < kms){
            System.out.println("You can't ride in negative kilometers");
            return;
        }
        kms = updateKms;
    }

    public String toString(){
        return color + " " + wheels + " " + price + " " + kms;
    }
}
