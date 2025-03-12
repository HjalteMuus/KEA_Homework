import java.time.LocalTime;

public class Tid {
    public static void main(String[] args) {
        int sekunder = 28;
        int minutter = 36;
        int timer = 9;

        int doegn = 24*60*60;

        int startSek = 0;
        int startMin = 36;
        int startTim = 9;

        int slutSek = 40;
        int slutMin = 11;
        int slutTim = 10;


        int midnatTilNu = 60*minutter + 3600*timer + sekunder;
        int nuTilMidnat = doegn - sekunder - 60*minutter - 3600*timer;
        int startSlut = (slutSek + slutMin*60 + slutTim*3600) - startSek - 60*startMin - 3600*startTim;

        System.out.println("Timer: " + timer + " minutter: " + minutter + " sekunder: " + sekunder);

        System.out.println("Siden midnat er der gået " + midnatTilNu + " sekunder");

        System.out.println("Der er " + nuTilMidnat + " sekunder til midnat");

        System.out.println("Fra starten af opgaven til nu er der gået " + startSlut + " sekunder");
    }
}
