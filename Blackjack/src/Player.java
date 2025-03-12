public class Player {
    private int score;
    public Player (int score){
        this.score = score;
    }
    public void rollDice(){
        score += (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
    }
    public int getPlayerScore(){
        return this.score;
    }
}
