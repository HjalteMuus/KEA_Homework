public class Dog extends Tamagotchi{
    private String breed;
    public Dog(String name, int age, String mood, int energy, int hunger, String breed){
        super(name, age, mood, energy, hunger);
        this.breed = breed;
    }

    public void setBreed(){
        int randomBreed = (int)(Math.random()*3+1);

        switch(randomBreed){
            case 1 -> breed = "German Shepard";
            case 2 -> breed = "Labrador";
            case 3 -> breed = "Pug";
            default -> System.out.println("oops");
        }
    }

    public String getBreed(){
        return breed;
    }

    @Override
    public void sound(){
        System.out.println("Bark! Bark! Bark!");
    }

    @Override
    public void getInfo(){
        System.out.println("Name: " + getName() + "\n" +
                           "Age: " + getAge() + "\n" +
                           "Mood: " + getMood() + "\n" +
                           "Energy: " + getEnergy() + "\n" +
                           "Hunger: " + getHunger() + "\n" +
                           "Breed: " + getBreed());
    }
}
