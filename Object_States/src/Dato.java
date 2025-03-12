public class Dato {
    private int year;
    private int month;
    private int date;

    public Dato(){
        this.year = 2000;
        this.month = 1;
        this.date = 1;
    }

    public Dato(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDate(){
        return this.date;
    }
}
