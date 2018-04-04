package main.java.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        // Get current date-time
        LocalDateTime unformattedCurrentTime = LocalDateTime.now();
        System.out.println("Current time before formatting: " + unformattedCurrentTime);

        // Format the current date-time using the specified format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedCurrentTime = unformattedCurrentTime.format(formatter);
        System.out.println("Current time after formatting: " + formattedCurrentTime);

        // Get a specific unit of time from the given time
        LocalDateTime givenTime = LocalDateTime.of(2018,2,27,21,52,23);
        System.out.println("Day of Week: " + givenTime.get(ChronoField.DAY_OF_WEEK));
        System.out.println("Day of Year: " + givenTime.get(ChronoField.DAY_OF_YEAR));
        System.out.println("Day of Month: " + givenTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Hour of Day: " + givenTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Minute of Day: " + givenTime.get(ChronoField.MINUTE_OF_DAY));

        // Add or subtract a specific number of days
        System.out.println("Yesterday: " + unformattedCurrentTime.minusDays(1).format(formatter));
        System.out.println("Tomorrow: " + unformattedCurrentTime.plusDays(1).format(formatter));

    }

}
