import java.util.Scanner;

public class SumAfTal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hej, og velkommen til en simpel heltalslommeregner, venligst skriv to tal du vil lægge sammen");
        int foersteTal = scanner.nextInt();
        int andetTal = scanner.nextInt();
        System.out.println(sum(foersteTal, andetTal));
    }
    public static int sum(int tal1, int tal2){
        return tal1+tal2;
    }
}

