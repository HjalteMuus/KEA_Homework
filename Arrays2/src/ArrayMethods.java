public class ArrayMethods {
    public static void main(String[] args){
        int[] array = {-7, 1, 2, 3, 4, -18, 5, 6, 9, 94};

        System.out.println(average(array));
        System.out.println(max(array));
        System.out.println(min(array));
    }

    public static double average(int[] array){
        double average = 0;
        for (int j : array) {
            average += j;
        }
        return average/array.length;
    }

    public static int max(int[] array){
        int max = array[0];
        for(int i : array){
            max = Math.max(max, i);
        }
        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        for(int i : array){
            min = Math.min(min, i);
        }
        return min;
    }
}
