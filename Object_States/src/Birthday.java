public class Birthday {
    public static void main(String[] args){
        Dato defaultBirthday = new Dato();
        Dato myBirthday = new Dato(1997, 12, 8);
        System.out.println( "The default birthday is: Year " + defaultBirthday.getYear() +
                            " Month " + defaultBirthday.getMonth() +
                            " Date " + defaultBirthday.getDate());

        System.out.println( "My birthday is: Year " + myBirthday.getYear() +
                            " Month " + myBirthday.getMonth() +
                            " Date " + myBirthday.getDate());
    }
}
