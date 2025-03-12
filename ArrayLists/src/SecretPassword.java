import java.util.*;

public class SecretPassword {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<String> secret = new ArrayList<>();

        String input = "";
        System.out.println("Please write 3 words that are the new passwords");

        for(int i = 0; i < 3; i++){
            input = s.nextLine().toLowerCase();
            secret.add(input);
        }

        System.out.println("Please guess 1 of 3 passwords");

        input = s.nextLine().toLowerCase();

        while(!secret.contains(input)){
            System.out.println("Wrong guess again");
            input = s.nextLine().toLowerCase();
        }

        System.out.println("Correct you guessed one of the passwords");



    }
}
