public class Person {
    String firstName;
    String lastName;
    String middleName;
    int age;
    public Person(String firstName, String lastName, String middleName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public String personInfo(){
        String nameAndAge;

        nameAndAge = this.firstName + " " +
                     this.middleName + " " +
                     this.lastName + " og er " +
                     this.age + " år gammel";

        return nameAndAge;
    }
}
