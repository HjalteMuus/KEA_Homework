public class Vaerelse {
    public static void main(String[] args) {
        Lampe sengelampe = new Lampe(true);
        Lampe skrivebordslampe = new Lampe(false);
        skrivebordslampe.trykPaaKnap();
        int lamper = sengelampe.getLampe() + skrivebordslampe.getLampe();
        System.out.println(lamper);
    }
}
