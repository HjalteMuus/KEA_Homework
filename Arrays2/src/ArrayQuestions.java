import java.util.*;

public class ArrayQuestions {
    public static void main(String[] args){
        int[] numbers = new int[8];
        numbers[1] = 4;
        numbers[4] = 99;
        numbers[7] = 2;

        int x = numbers[1];
        numbers[x] = 44;
        numbers[numbers[7]] = 11;

        System.out.println(Arrays.toString(numbers));
    }
}