import java.util.*;

public class Game {
    public static void main(String[] args){
        start();
    }

    public static void start(){
        Scanner scan = new Scanner(System.in);

        String nameAndAnimal = adopt(scan); //Always comes as name first then what animal
        String splitter = " ";
        String[] split = nameAndAnimal.split(splitter); //Use split in order to separate name and animal

        System.out.println(split[0] + " is a " + split[1]);

        /*Tamagotchi t = new Tamagotchi(split[0], //name
                                      (int)(Math.random() * 8 + 1), //picks a random integer from 1 to 8
                                      "Happy and is well fed", //current mood of tamagotchi
                                      10, //current energy, higher is better
                                      0); //current hunger, lower is better
                                        */

        //Not quite sure how I can do this, but would love some advice in how to make it better
        //Not sure how I can make it with the Tamagotchi class and then change it to Dog or Cat
        if(split[1].equalsIgnoreCase("dog")){
            Dog dog = new Dog(split[0], 1, "Happy and is well fed", 10, 0, "");
            dog.setBreed();
            commands(dog, scan);
        }else{
            Cat cat = new Cat(split[0], 1, "Happy and is well fed", 10, 0, "");
            String question = "";
            System.out.println("Is the cat going to be indoor or outdoor?");
            question = scan.nextLine();
            cat.setStreetcat(question, scan);
            commands(cat, scan);
        }

        scan.close();
    }

    public static String adopt(Scanner s){
        String whatAnimal;
        String name;
        boolean notValid; //If notValid is true, then you haven't written a valid input

        System.out.println("Hello and welcome to my small tamagotchi-like game");
        System.out.println("Now which animal would you like to adopt? Cat or Dog?");
        whatAnimal = s.nextLine();
        notValid = isAnimal(whatAnimal);

        while(notValid){
            System.out.println("You can only adopt cats or dogs, for now");
            whatAnimal = s.nextLine();
            notValid = isAnimal(whatAnimal);
        }

        System.out.println("You have adopted a " + whatAnimal + " what would you like to name it");
        name = s.nextLine();

        System.out.println(name + " is a wonderful name, hope you take good care of " + name);
        System.out.println("*Dev note: I'm just gonna assume you actually wrote a good name " +
                           "don't want to make a lot of checks for that*");

        return name + " " + whatAnimal;
    }

    public static boolean isAnimal(String whatAnimal){
        if(whatAnimal.equalsIgnoreCase("cat")){
            System.out.println("Cat it is");
            return false;
        } else if(whatAnimal.equalsIgnoreCase("dog")){
            System.out.println("Dog it is");
            return false;
        }
        return true;
    }

    public static void commands(Tamagotchi t, Scanner s){
        boolean playing = true;
        String command;

        //Gives the users the commands for the tamagotchi
        System.out.println("You can use these commands to interact with " + t.getName() + "\n" +
                           "play: plays with " + t.getName() + "\n" +
                           "feed: feeds " + t.getName() + "\n" +
                           "sleep: makes " + t.getName() + " take a nap\n" +
                           "info: gets all the relevant info of " + t.getName() + "\n" +
                           "sound: listens to " + t.getName() + "\n" +
                           "stop: stops the program");

        while(playing){
            if(t.getHunger() >= 10 && t.getEnergy() < 1 || t.getHunger() > 15){
                System.out.println("You haven't taken good enough care of " + t.getName() + " " +
                                   "we have to take them away.");
                break;
            }
            command = s.nextLine();
            if(command.equalsIgnoreCase("play")){
                t.playWith();

            } else if(command.equalsIgnoreCase("stop")){
                playing = false;
                System.out.println("Thanks for playing, hope you had fun");

            } else if(command.equalsIgnoreCase("sleep")){
                t.sleep();

            } else if(command.equalsIgnoreCase("feed")){
                t.feed();

            } else if(command.equalsIgnoreCase("info")){
                t.getInfo();

            } else if(command.equalsIgnoreCase("sound")){
                t.sound();
            } else{
                System.out.println("Oops that's not a command " + t.getName() +
                                   " knows, try a different one");

            }
        }
    }
}
