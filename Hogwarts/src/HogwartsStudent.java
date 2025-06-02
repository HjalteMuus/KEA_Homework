import java.util.ArrayList;
import java.util.Comparator;

public class HogwartsStudent {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent (String firstName, String lastName, String house){
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    public String getFirstName (){
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getHouse (){
        return house;
    }

    public void setHouse (String house){
        if (house.equalsIgnoreCase("Gryffindor") ||
            house.equalsIgnoreCase("Slytherin")){
            this.house = house;
        }else {
            System.out.println("House doesn't exists");
        }
    }

    public void sortStudents(ArrayList<HogwartsStudent> list){
        list.sort(Comparator.comparing(HogwartsStudent :: getLastName));
    }
}
