public class CykelMain {
    public static void main(String[] args){
        Cyklist cyklist = new Cyklist("Peter");
        Cyklist cyklist1 = new Cyklist("Kasper");
        LadCykel ladCykel = new LadCykel("Gul", 0, 2000, 2);

        ladCykel.addBiker(cyklist);
        ladCykel.addBiker(cyklist1);
        System.out.println(ladCykel.whoDrives());
        ladCykel.removeBiker();
        System.out.println(ladCykel.whoDrives());
    }
}
