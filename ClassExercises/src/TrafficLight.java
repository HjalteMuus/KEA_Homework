import java.util.Scanner;

public class TrafficLight {
    String color;
    int duration;
    final int MAX_DURATION = 20;
    String crossing;

    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    public void changeLight(){
        if(duration == 0) {
            if (color.equalsIgnoreCase("Green")) {
                color = "Yellow";
                duration = MAX_DURATION;
            }
            else if (color.equalsIgnoreCase("Yellow")) {
                color = "Red";
                duration = MAX_DURATION;
            }
            else if (color.equalsIgnoreCase("Red")) {
                color = "Green";
                duration = MAX_DURATION;
            }
            else {
                color = "Green";
                duration = MAX_DURATION;
            }
        }
    }

    public void reduceDuration(){
        duration--;
    }

    public String checkLight(String lightColor){
        if(lightColor.equalsIgnoreCase("Green")){
            return lightColor + ", it is safe to cross";
        }
        return lightColor + ", it is not safe to cross";
    }

    public static void main(String[] args){
        TrafficLight light = new TrafficLight("Red", 20);
        boolean checking = true;
        while(checking){
            light.reduceDuration();
            light.changeLight();
            if(light.color.equalsIgnoreCase("Green")){
                System.out.println(light.checkLight(light.color));
                checking = false;
            }
            else if(light.duration >= 19 || light.duration < 3){
                System.out.println(light.checkLight(light.color));
            }
        }
    }
}
