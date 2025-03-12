public class Machine{
    private int machineScore;
    public Machine(int machineScore){
        this.machineScore = machineScore;
    }

    public void rollDice(){
        machineScore += (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
    }

    public int getMachineScore(){
        return this.machineScore;
    }
}
