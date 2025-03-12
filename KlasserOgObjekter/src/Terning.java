import java.util.Random;

public class Terning {
    final int MAX = 6;
    int faceValue;
    Random randomValue;

    public Terning(){
        randomValue = new Random();
        this.faceValue = randomValue.nextInt(1,MAX);
    }

    public void roll(){
        faceValue = randomValue.nextInt(1,MAX);
    }
}
