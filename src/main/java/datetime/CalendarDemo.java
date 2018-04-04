package main.java.datetime;

import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {

        // Get current date-time in format: Sat Mar 17 11:56:47 IST 2018
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current date: " + calendar.getTime());

        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());

        calendar.add(Calendar.MONTH, 3);
        System.out.println("3 months later: " + calendar.getTime());

        calendar.add(Calendar.YEAR, 8);
        System.out.println("8 years later: " + calendar.getTime());

        System.out.println("Calendar's current year: " + calendar.get(Calendar.YEAR));
        System.out.println("Calendar's current day: " + calendar.get(Calendar.DATE));

        int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in week: " + maximum);

        maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in year: " + maximum);

        int minimum = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + minimum);

        minimum = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + minimum);

    }

}
