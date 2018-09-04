package com.lee.DesignPatternsDemo;

public enum Weekday {
    SUN(0,"1"),MON(1,"1"),TUS(2,"1"),WED(3,"1"),THU(4,"1"),FRI(5,"1"),SAT(6,"1");

    private int value;
    private Weekday(int value,String x){
        this.value = value;
    }

    public static Weekday getNextDay(Weekday nowDay){
        int nextDayValue = nowDay.value;

        if (++nextDayValue == 7){
            nextDayValue =0;
        }

        return getWeekdayByValue(nextDayValue);
    }

    public static Weekday getWeekdayByValue(int value) {
        for (Weekday c : Weekday.values()) {
            if (c.value == value) {
                return c;
            }
        }
        return null;
    }
}

