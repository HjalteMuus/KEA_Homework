import java.util.ArrayList;
import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Yugi");
        names.add("Joey");
        names.add("Mai");
        names.add("Tristan");

        System.out.println("Please write the name you would like to search");
        String nameGuess = s.nextLine();
        String yesOrNo;
        while(!names.contains(nameGuess)){
            System.out.println("That name is not on the list, would you like to add it to the list? y/n");
            yesOrNo = s.nextLine();
            if(yesOrNo.equalsIgnoreCase("yes")){
                names.add(nameGuess);
            }else{
                System.out.println("Then please guess again");
            }
            nameGuess = s.nextLine();
        }

        System.out.println("Great you guessed a name on the list and it was number " +
                           names.indexOf(nameGuess) + " in the array list");
    }
}
