public class LadCykel extends Cykel{
    private int seats;
    private Cyklist passenger;

    public LadCykel(String color, double kms, double price, int wheels){
        super(color, kms, price, wheels);
    }

    public boolean addBiker(Cyklist c){
        if (passenger == null){
            this.passenger = c;
            System.out.println(c + " is now seated");
            return true;
        }
        return false;
    }

    public Cyklist whoDrives(){
        return passenger;
    }

    public Cyklist removeBiker(){
        if(passenger != null){
            System.out.println(passenger);
            return passenger = null;
        }else{
            return passenger;
        }
    }
}
