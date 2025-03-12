import java.util.Scanner;

public class Cat extends Tamagotchi{
    private String streetcat;
    public Cat(String name, int age, String mood, int energy, int hunger, String streetcat){
        super(name, age, mood, energy, hunger);
        this.streetcat = streetcat;
    }

    public void setStreetcat(String updateStreetcat, Scanner s){
        if(updateStreetcat.equalsIgnoreCase("Outdoor")){
            streetcat = updateStreetcat;
        }
        while(!updateStreetcat.equalsIgnoreCase("Indoor")){
            System.out.println("Is the cat an indoor or outdoor cat?");
            updateStreetcat = s.nextLine();
        }
        streetcat = updateStreetcat;
    }

    public String getStreetcat(){
        return streetcat;
    }

    @Override
    public void sound(){
        System.out.println("Meow! Meow! Meow!");
    }

    @Override
    public void getInfo(){
        System.out.println("Name: " + getName() + "\n" +
                           "Age: " + getAge() + "\n" +
                           "Mood: " + getMood() + "\n" +
                           "Energy: " + getEnergy() + "\n" +
                           "Hunger: " + getHunger() + "\n" +
                           "Streetcat: " + getStreetcat());
    }
}
