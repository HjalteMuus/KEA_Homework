import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zodiacSign = "";

        System.out.println("Please write the month you were born in a whole number (aka January is 1," +
                " February is 2 and so on)");
        int month = scanner.nextInt();

        System.out.println("Please write your birth date (1-31)");
        int day = scanner.nextInt();

        switch (month){
            case 1:
                if(day > 31 || day <= 0) break; //Tjekker om datoen er gyldig, hvis den ikke er stopper den switchen
                zodiacSign = (day >= 19)? "You are an Aquarius" : "You are a Capricorn";
                break;
            case 2:
                if(day > 29 || day <= 0) break;
                zodiacSign = (day >= 19)? "You are a Pisces" : "You are an Aquarius";
                break;
            case 3:
                if(day > 31 || day <= 0) break;
                zodiacSign = (day >= 20)? "You are an Aries" : "You are a Pisces";
                break;
            case 4:
                if(day > 30 || day <= 0) break;
                zodiacSign = (day >= 20)? "You are a Taurus" : "You are an Aries";
                break;
            case 5:
                if(day > 31 || day <= 0) break;
                zodiacSign = (day >= 21)? "You are a Gemini" : "You are a Taurus";
                break;
            case 6:
                if(day > 30 || day <= 0) break;
                zodiacSign = (day >= 21)? "You are a Cancer (no not the medical kind)" : "You are a Gemini";
                break;
            case 7:
                if(day > 31 || day <= 0) break;
                zodiacSign = (day >= 23)? "You are a Leo" : "You are a Cancer (no not the medical kind)";
                break;
            case 8:
                if(day > 31 || day <= 0) break;
                zodiacSign = (day >= 23)? "You are a Virgo" : "You are a Leo";
                break;
            case 9:
                if(day > 30 || day <= 0) break;
                zodiacSign = (day >= 23)? "You are a Libra" : "You are a Virgo";
                break;
            case 10:
                if(day > 31 || day <= 0) break;
                zodiacSign = (day >= 23)? "You are a Scorpio" : "You are a Libra";
                break;
            case 11:
                if(day > 30 || day <= 0) break;
                zodiacSign = (day >= 22)? "You are a Sagittarius" : "You are a Scorpio";
                break;
            case 12:
                if(day > 31 || day <= 0) break;
                zodiacSign = (day >= 22)? "You are a Capricorn" : "You are a Sagittarius";
                break;
            default:
                break;
        }
        //Hvis der skrives en ugyldig dato ændres zodiacSign ikke, og der bliver dobbelttjekket om
        //zodiacSign er tom med hjælp af .isEmpty() metoden. Hvis der er ændret i zodiacSign
        //printer den zodiacSign til terminalen.
        if (zodiacSign.isEmpty()){
            System.out.println("Please write a valid month/date");
        }
        else {
            System.out.println(zodiacSign);
        }


        /*if(month == 3 && day >=20 || (month == 4 && day < 20)){
            System.out.println("You are an Aries");
        }
        else if(month == 4 || (month == 5 && day < 21)){
            System.out.println("You are a Taurus");
        }
        else if(month == 5 || (month == 6 && day < 21)){
            System.out.println("You are a Gemini");
        }
        else if(month == 6 || (month == 7 && day < 23)){
            System.out.println("You are a Cancer (no not the medical kind)");
        }
        else if(month == 7 || (month == 8 && day < 23)){
            System.out.println("You are a Leo");
        }
        else if(month == 8 || (month == 9 && day < 23)){
            System.out.println("You are a Virgo");
        }
        else if(month == 9 || (month == 10 && day < 23)){
            System.out.println("You are a Libra");
        }
        else if(month == 10 || (month == 11 && day < 22)){
            System.out.println("You are a Scorpio");
        }
        else if(month == 11 || (month == 12 && day < 22)){
            System.out.println("You are a Sagittarius");
        }
        else if(month == 12 || (month == 1 && day < 20)){
            System.out.println("You are a Capricorn");
        }
        else if(month == 1 || (month == 2 && day < 19)){
            System.out.println("You are an Aquarius");
        }
        else{
            System.out.println("You are a Pisces");
        }*/
    }
}
