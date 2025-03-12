public class Lampe {
    public boolean isOn;
    private static int lampe;
    public Lampe(boolean isOn){
        this.isOn = isOn;
    }
    public Lampe(){
        this.isOn = false;
    }
    public void trykPaaKnap(){
        this.isOn = !this.isOn;
    }
    public int getLampe(){
        return lampe;
    }
}

