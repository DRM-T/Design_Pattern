package DesignPatern.Bai1;

public class Date {
    private int year;
    private int month;
    private int day;

    /**yaya.*/
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**yaya.*/
    public int getYear() {
        return year;
    }

    /**yaya.*/
    public void setYear(int year) {
        this.year = year;
    }

    /**yaya.*/
    public int getMonth() {
        return month;
    }

    /**yaya.*/
    public void setMonth(int month) {
        this.month = month;
    }

    /**yaya.*/
    public int getDay() {
        return day;
    }

    /**yaya.*/
    public void setDay(int day) {
        this.day = day;
    }

    /**yaya.*/
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}
