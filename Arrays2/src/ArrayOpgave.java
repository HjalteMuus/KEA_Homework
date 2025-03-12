import java.util.*;

public class ArrayOpgave {
    static int counter = 0; //Denne counter bruges til meget, derfor gjorde jeg den global

    public static void main(String[] args){
        int[] arr = {-2, -1, 0, 1, 2, 3, 4, 5, 6};
        String[] names = {"James" , "Jane", "Unknown", "Michael"};
        Scanner scanner = new Scanner(System.in);

        int[] userArray = userArray(scanner);

        printReverse(arr);
        System.out.println( + count(arr, 1));
        replaceAll(names, "unknown", "Luca");
        System.out.println(indexOf(names, "James"));
        System.out.println(Arrays.toString(odds(userArray)));
        System.out.println(Arrays.toString(evens(userArray)));
    }

    //Metode der bruger scanneren som parameter til at få længden og starttal for userArray
    public static int[] userArray(Scanner s) {

        int userNumber;

        System.out.println("Please write an integer number greater than 0 for the length of your array");
        userNumber = s.nextInt();

        int[] userArray = new int[userNumber];

        System.out.println("Please write an integer number from which the starting number is");
        userNumber = s.nextInt();

        //Udfylder arrayet med en talrække der starter fra userNumber
        for(int i = 0; i < userArray.length; i++){
            userArray[i] = userNumber+i;
        }
        return userArray;
    }

    public static void printReverse(int[] array){
        //Laver et tomt array hvor jeg putter array værdier ind i
        int[] reverse = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reverse[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverse) + " is the reverse array of " + Arrays.toString(array));
    }

    public static int count(int[] arr, int target){
        counter = 0;
        for(int i : arr){
            if(i == target){
                counter++;
            }
        }
        return counter;
    }

    public static void replaceAll(String[] arr, String target, String replacement){
        for(int i = 0; i < arr.length; i++){
            //Bruger equalsIgnoreCase til at sørge for både store og små bogstaver "ses som det samme"
            if(arr[i].equalsIgnoreCase(target)){
                arr[i] = replacement;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*Starter med at sætte indexOf til -1 og hvis jeg så finder et "target" sætter jeg den til 1
    og tæller videre derfra */
    public static int indexOf(String[] arr, String target){
        int indexOf = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(target) && indexOf == -1){
                indexOf = 1;
            }else if(arr[i].equals(target)){
                indexOf++;
            }
        }
        return indexOf;
    }

    //Har gjort så min odds og evens metode kan godtage talrækker hvor der er "huller" i
    public static int[] odds(int[] arr){
        counter = 0;

        //Tæller hvor mange ulige tal der er
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                counter++;
            }
        }

        //Laver et array der har præcist den mængde indexer der skal bruges
        int[] odd = new int[counter];
        counter = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 != 0){
                odd[counter] = arr[j];
                counter++;
            }
        }
        return odd;
    }

    //Gør det samme som odds, men bare for lige tal
    public static int[] evens(int[] arr){
        counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }
        int[] even = new int[counter];
        counter = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 == 0){
                even[counter] = arr[j];
                counter++;
            }
        }
        return even;
    }
}
