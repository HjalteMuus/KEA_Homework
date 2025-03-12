public class Scrabble {
    public static void main(String[] args){
        Tile tile1 = new Tile('a', 0);
        tile1.printTile(tile1);
        tile1.setLetter('z');
        tile1.setValue(10);
        tile1.printTile(tile1);
    }
}
