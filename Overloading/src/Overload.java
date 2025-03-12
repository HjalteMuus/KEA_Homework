import java.util.Random;

//Overloading is when you use the same name for a method, but with different parameters, aka what's inside the ().

public class Overload {
    public static void main(String[] args){
        int sum = addNum(1,2);
        double result = addNum(1.2, 2.9);
        int sumOf3 = addNum(1,4,9);

        System.out.println(sum);
        System.out.println(sumOf3);
        System.out.println(result);

        Overload o = new Overload();

        o.addNum();
    }

    public static int addNum(int a, int b){ //adds 2 ints
        return a + b;
    }

    public static double addNum(double a, double b){ //Same name but adds 2 doubles
        return a + b;
    }

    public static int addNum(int a, int b, int c){ //Again, same name but adds 3 ints
        return a + b + c;
    }

    public void addNum(){ //Same name, but adds 2 random numbers (1-5)
        Random r = new Random();
        System.out.println(r.nextInt(6) + r.nextInt(6));
    }
}
