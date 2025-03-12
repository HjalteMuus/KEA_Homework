public class Student {
    private String name;
    private int age;
    private String favoriteGame;

    public Student(String name, int age, String favoriteGame){
        this.name = name;
        this.age = age;
        this.favoriteGame = favoriteGame;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        if(isValid(newAge)){
            this.age = newAge;
        } else {
            System.out.println(newAge + " is an invalid update age as the student is " + this.age + " years old");
        }
    }

    public boolean isValid(int newAge){
        if(newAge < this.age){
            return false;
        } else if(newAge < 0){
            return false;
        }
        return true;
    }

    public String getFavoriteGame(){
        return this.favoriteGame;
    }

    public void setFavoriteGame(String newFavoriteGame){
        this.favoriteGame = newFavoriteGame;
    }

    public void showStudent(){
        System.out.println("Name of student: " + this.name + "\n" +
                           "Age of student: " + this.age + "\n" +
                           "Favorite game of student: " + this.favoriteGame);

    }
}
