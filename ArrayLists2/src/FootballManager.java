import java.util.ArrayList;

public class FootballManager {
    private ArrayList<String> spillere;

    // Du må gerne erstatte med andre fodboldspillere hvis du har nogle favoritter :)
    public FootballManager() {
        this.spillere = new ArrayList<>();
        spillere.add("Alexia Putellas");
        spillere.add("Sam Kerr");
        spillere.add("Aitana Bonmatí");
        spillere.add("Caroline Graham Hansen");
        spillere.add("Ada Hegerberg");
        spillere.add("Megan Rapinoe");
        spillere.add("Alex Morgan");
        spillere.add("Wendie Renard");
    }

    public void visSpillere() {
        System.out.println("\n⚽ FootballManager - Dit Hold:");
        // lav et flot print der fortæller hvilke spillere der er på dit hold
        // Sørg for at give en fejl, hvis der ingen spillere er på holdet
        if(spillere.isEmpty()){
            System.out.println("Ingen spillere på holdet");
            return;
        }
        System.out.println(spillere);
    }

    public void tilføjSpiller(String navn) {
        // Sørg her for at metoden tilføjer en spiller på holdet med parameter: navn
        if(navn.isEmpty()){
            System.out.println("Kan ikke tilføje tomme navne");
            return;
        }
        spillere.add(navn);
        System.out.println("⚽ " + navn + " er tilføjet til holdet!");
    }


    public void søgSpiller(String navn) {
        // Her skal laves en metode der leder efter en bestemt spiller og fortæller om spilleren er på holdet
        // Der skal også gives besked hvis spilleren ikke er på holdet
        if(spillere.contains(navn)){
            System.out.println(navn + " er på holdet");
        }else{
            System.out.println(navn + " er ikke på holdet");
        }

    }

    public void sorterSpillere() {
        // Implementer her en metode der returnerer en sorteret liste af spillere
        spillere.sort(null);
        System.out.println(" Spillere er nu sorteret alfabetisk!");
    }
}
