public class Tamagotchi {
    private String name;
    private int age;
    private String mood;
    private int energy;
    private int hunger;
    private final int MAX_ENERGY = 10;

    public Tamagotchi(String name, int age, String mood, int energy, int hunger){
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.hunger = hunger;
    }

    public void getInfo(){
        System.out.println("Name: " + getName() + "\n" +
                           "Age: " + getAge() + "\n" +
                           "Mood: " + getMood() + "\n" +
                           "Energy: " + getEnergy() + "\n" +
                           "Hunger: " + getHunger());
    }

    public void playWith(){
        System.out.println("You played with " + name + " and made " + name + " happier." +
                "\n" + name + " also got slightly hungry and less energetic.");

        setHunger(hunger + 1);
        setEnergy(energy - 1);
        setMood();
        System.out.println(getMood());
    }

    public void feed(){
        System.out.println(name + " got fed and is full");
        setHunger(0);
    }

    public void sleep(){
        System.out.println(name + " went to sleep and became energetic again");
        setEnergy(MAX_ENERGY);
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge < age){
            System.out.println(name + " unfortunately can't get younger");
        }else{
            age = newAge;
        }
    }

    public String getMood(){
        return mood;
    }

    public void setMood(){
        if(energy > 7){
            mood = "Happy and is " + isHungry();
        } else if(energy > 3){
            mood = "Neutral and is " + isHungry();
        } else{
            mood = "Unhappy and is " + isHungry();
        }
    }

    public int getEnergy(){
        return energy;
    }

    public void setEnergy(int newEnergy){
        energy = newEnergy;
    }

    public int getHunger(){
        return hunger;
    }

    public void setHunger(int newHunger){
        if(newHunger < 0){
            System.out.println("Hunger can't be less than zero");
            return;
        }
        hunger = newHunger;
    }

    public String isHungry(){
        if(hunger < 4){
            return "well fed";
        } else if(hunger < 8){
            return "a bit hungry";
        }
        return "starving";
    }

    public void sound(){
        System.out.println("I'm a tamagotchi, and this is the sound I make");
    }
}
