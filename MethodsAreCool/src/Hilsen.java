import java.util.Scanner;

public class Hilsen {

    public String navn;

    public Hilsen (String navn){
        this.navn = navn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hej, jeg er et hilsenprogram, hvad hedder du? ");
        String brugerNavn = scanner.nextLine();
        //System.out.println(hej(brugerNavn));
        //System.out.println(hej("Anne"));
        Hilsen mitNavn = new Hilsen(brugerNavn);
        mitNavn.hej();

    }
    /*public static String hej(String navn){
        return "Hej " + navn;
    }*/
    public void hej(){
        System.out.println("Hej, du hedder " + this.navn);
        return;
    }
}
