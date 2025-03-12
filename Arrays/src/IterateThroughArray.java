public class IterateThroughArray {
    public static void main(String[] args){
        double[] arr = {4.5, 25.3, 12.1, 34.0, 15.5};
        double pow = 0;

        for (double i : arr) {
            pow = Math.pow(i, 2);
            System.out.println(pow);
        }

        double value = 0;
        double comp = 0;
        for (double i : arr){
            comp += i;
        }
        for(double i : arr){
            value = i;
            comp = Math.min(value, comp);
        }
        System.out.println(comp);

        comp = 0;
        for(double i : arr){
            value = i;
            comp = Math.max(value, comp);
        }
        System.out.println(comp);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 12.1){
                System.out.println("Hurra! Jeg fandt 12.1. Det stod på index " + (i+1));
            }
        }
    }
}
