package com.aboba.laba;

public class Date {
    private final int year;
    private final int day;
    private int dayOfWeek;

    public Date(int year, int day) {
        this.year = year;
        this.day  = day;
        this.dayOfWeek = 0;
    }

    public long getYear() {
        return year;
    }

    public long getDay() {
        return day;
    }

    public void calulateDayOfWeek() {
        int yearIndex = (year % 100) / 12 + (year % 100) % 12 + ((year % 100) % 12) / 4;
        int mounthIndex = 6;
        dayOfWeek = yearIndex + mounthIndex + 1;
        if(year / 100 == 19){
            ++dayOfWeek;
        }
        if(year % 4 == 0){
            --dayOfWeek;
        }

        dayOfWeek = (dayOfWeek % 7);
        dayOfWeek = ((dayOfWeek % 7) + ((day - 1) % 7)) % 7 ;

    }

    public String getDayOfWeek() {
        calulateDayOfWeek();

        switch (dayOfWeek){
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 0:
            return "Sunday";
        default:
            return "Data is not correct";
        }
    }
}
