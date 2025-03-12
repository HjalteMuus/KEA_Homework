import java.util.*;

public class FavoriteAnimal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<String> animalList = new ArrayList<>();

        animalList.add("Dog");
        animalList.add("Snake");
        animalList.add("Eagle");

        for(String animal : animalList){
            System.out.println(animal);
        }

        System.out.println("Animal list: " + animalList);

        animalList.add("Elephant");

        System.out.println(animalList);

        animalList.remove("Dog");

        System.out.println(animalList);

        System.out.println("What animal should we add to the list?");
        String input = s.nextLine();

        animalList.add(input);

        System.out.println(animalList);

        animalList.sort(null);

        System.out.println(animalList);

    }
}
