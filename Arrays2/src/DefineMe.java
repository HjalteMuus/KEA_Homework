import java.util.*;

public class DefineMe {
    public static void main(String[] args){
        double[] arr = {4.5, 25.3, 12.1, 34.0, 15.5};

        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.pow(arr[i], 2);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            arr[i] = Math.sqrt(arr[i]);
        }
        System.out.println("Elements if you don't redefine array " + Arrays.toString(arr));

        double[] arr2 = {4.5, 25.3, 12.1, 34.0, 15.5};
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Math.sqrt(arr2[i]);
        }
        System.out.println("Elements if you do redefine array " + Arrays.toString(arr2));

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 34.0){
                System.out.println("Value found at index " + i);
            }
        }

        double max = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                index = i;
            }
            max = Math.max(max, arr[i]);
        }
        System.out.println(max + " is the max value at index " + index);

        double min = max;

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                index = i;
            }
            min = Math.min(min, arr[i]);
        }
        System.out.println(min + " is the min value at index " + index);

    }
}
