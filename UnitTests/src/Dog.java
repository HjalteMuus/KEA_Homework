public class Dog {
    private String name;
    private int age;

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int dogAgeToHumanAge(){
        return age * 7;
    }

    public Dog findOldestDog(Dog[] dogList){
        int oldest = 0;
        Dog oldestDog = null;
        for (int i = 0; i < dogList.length; i++) {
            oldest = Math.max(dogList[i].getAge(), oldest);
            if(dogList[i].getAge() == oldest){
                oldestDog = dogList[i];
            }
        }
        return oldestDog;
    }
}
