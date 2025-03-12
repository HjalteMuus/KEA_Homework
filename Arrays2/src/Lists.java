import java.util.*;

public class Lists {
    public static void main(String[] args){
        int[] list = {2, 18, 6, -4, 5, 1};
        int addedNumber = 0;
        for(int i = 0; i < list.length; i++){
            addedNumber = list[i]/list[0];
            list[i] = list[i] + addedNumber;
        }
        System.out.println(Arrays.toString(list));
    }
}
