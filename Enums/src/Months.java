import java.util.Scanner;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

class Season{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int input = s.nextInt();

        while(input < 1 || input > 12){
            System.out.println("Please write a number between 1 and 12");
            input = s.nextInt();
        }

        Months month = null;

        switch(input){
            case 1 ->  month = Months.JANUARY;
            case 2 ->  month = Months.FEBRUARY;
            case 3 ->  month = Months.MARCH;
            case 4 ->  month = Months.APRIL;
            case 5 ->  month = Months.MAY;
            case 6 ->  month = Months.JUNE;
            case 7 ->  month = Months.JULY;
            case 8 ->  month = Months.AUGUST;
            case 9 ->  month = Months.SEPTEMBER;
            case 10 -> month = Months.OCTOBER;
            case 11 -> month = Months.NOVEMBER;
            case 12 -> month = Months.DECEMBER;
            default -> System.out.println("Bruh");
        }

        if(month == Months.JANUARY || month == Months.FEBRUARY || month == Months.DECEMBER){
            System.out.println("It is Winter, time for a snowball fight");
        }else if(month == Months.MARCH || month == Months.APRIL|| month == Months.MAY){
            System.out.println("It is Spring, time to see the trees grow leaves again");
        }else if(month == Months.JUNE || month == Months.JULY || month == Months.AUGUST){
            System.out.println("It is Summer, get down to the beach and enjoy the heat");
        }else{
            System.out.println("It is Autumn, lets enjoy the beauty of the orange leaves");
        }
    }
}