import java.util.Scanner;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class SchooldayOrWeekend{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Here are all the days in the week with a number next to them");
        System.out.println("1: Monday\n2: Tuesday\n3: Wednesday\n4: Thursday\n5: Friday\n6: Saturday\n7: Sunday");

        int input = s.nextInt();

        while(input < 1 || input > 7){
            System.out.println("Write a number between 1 and 7");
            input = s.nextInt();
        }

        WeekDay day = null;

        switch (input){
            case 1 -> day = WeekDay.MONDAY;
            case 2 -> day = WeekDay.TUESDAY;
            case 3 -> day = WeekDay.WEDNESDAY;
            case 4 -> day = WeekDay.THURSDAY;
            case 5 -> day = WeekDay.FRIDAY;
            case 6 -> day = WeekDay.SATURDAY;
            case 7 -> day = WeekDay.SUNDAY;
            default -> System.out.println("Bruh, how");
        }

        /*switch(day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a schoolday");
            case SATURDAY, SUNDAY -> System.out.println("It's weekend");
        }*/

        if(day == WeekDay.SATURDAY || day == WeekDay.SUNDAY){
            System.out.println("It's the weekend, just go back to sleep");
        }else if(day == WeekDay.MONDAY){
            printSchool();
            System.out.println("And it's monday again...");
        }else if(day == WeekDay.FRIDAY){
            printSchool();
            System.out.println("But at least the weekend starts after school");
        }else{
            printSchool();
        }
    }

    public static void printSchool(){
        System.out.println("It's a schoolday");
    }
}