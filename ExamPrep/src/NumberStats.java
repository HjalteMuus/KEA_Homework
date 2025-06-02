import java.util.ArrayList;
import java.util.Random;

public class NumberStats {
    ArrayList<Integer> numbers = new ArrayList<>();
    Random random = new Random();

    public void populateArrayList(int length) {
        for (int i = 0; i < length; i++) {
            numbers.add(random.nextInt(1,100));
        }
    }

    public ArrayList<Integer> getEvenNumbers(){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public ArrayList<Integer> getOddNumbers(){
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}

class Main {
    public static void main(String[] args) {
        NumberStats stats = new NumberStats();
        stats.populateArrayList(10);

        System.out.println("All numbers: " + stats.numbers);
        System.out.println("Even numbers: " + stats.getEvenNumbers());
        System.out.println("Odd numbers: " + stats.getOddNumbers());
    }
}


