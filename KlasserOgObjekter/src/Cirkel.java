public class Cirkel {
    double radius;

    public Cirkel(double radius){
        this.radius = radius;
    }

    public double beregnAreal(){
        return 2 * this.radius * Math.PI;
    }
}
