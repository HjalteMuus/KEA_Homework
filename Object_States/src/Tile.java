public class Tile {
    private char letter;
    private int value;

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public char getLetter(){
        return this.letter;
    }

    public void setLetter(char newLetter){
        this.letter = newLetter;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int newValue){
        this.value = newValue;
    }

    public void printTile(Tile tile){
        System.out.println("The letter on the tile is " + tile.getLetter());
        System.out.println("The value on the tile is " + tile.getValue());
    }
}
