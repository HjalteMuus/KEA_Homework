public class Arrays1 {
    public static void main(String[] args){
        int[] ints = new int[8];
        ints[0] = 34;
        ints[7] = 117;

        for (int i : ints) {
            System.out.println(i);
        }

        String[] hilsen = {"Hej ", "med ", "dig"};
        for(String i : hilsen){
            System.out.print(i);
        }

        double[] doubles = {3.4, 2.5, 1.2, 6.7};
        System.out.println(doubles[2]);
        System.out.println(doubles.length);
    }
}
