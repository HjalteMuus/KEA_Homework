public class StudentMain {
    public static void main(String[] args){
        Student student1 = new Student("Hjalte Muus Bischoff", 27, "Borderlands");
        student1.showStudent();
        student1.setAge(28);
        student1.setFavoriteGame("Tales of Arise");
        student1.showStudent();
    }
}
