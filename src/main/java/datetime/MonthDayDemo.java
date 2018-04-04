package main.java.datetime;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayDemo {

    public static void main(String[] args) {

        MonthDay monthDay = MonthDay.now();
        LocalDate date = monthDay.atYear(1990);
        System.out.println(date);
        System.out.println(monthDay.isValidYear(1994));

        // Get the month of the year
        long monthOfYear = monthDay.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("Month of year: " + monthOfYear);

        ValueRange monthRange = monthDay.range(ChronoField.MONTH_OF_YEAR);
        System.out.println("Range of months in a year: " + monthRange);
        ValueRange dayRange = monthDay.range(ChronoField.DAY_OF_MONTH);
        System.out.println("Range of days in this month: " + dayRange);
    }

}
