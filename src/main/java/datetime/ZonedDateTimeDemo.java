package main.java.datetime;

import java.time.*;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {

        // Parse the given string as a ZonedDateTime instance
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2018-03-05T22:10:10+05:30[Asia/Kolkata]");
        System.out.println("Parsed Time: " + zonedDateTime);

        // Get Afghanistan's time zone using the given ZonedDateTime and ZoneId instances
        LocalDateTime localDateTime = LocalDateTime.of(2018, Month.MARCH, 5,22,12, 50);
        ZoneId afghanistan = ZoneId.of("Asia/Kabul");
        ZonedDateTime afghanZone = ZonedDateTime.of(localDateTime, afghanistan);
        System.out.println("Afghanistan time zone: " + afghanZone);

        // Get the same copy of Afghanistan date-time and change it to India date-time
        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZonedDateTime  indiaZone = afghanZone.withZoneSameInstant(india);
        System.out.println("India time zone: " + indiaZone);

        // Get Current time
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current zone id: " + now.getZone());

        // Subtract the given amount of time
        ZonedDateTime tenDaysAgo = now.minus(Period.ofDays(10));
        System.out.println("Ten days ago: " + tenDaysAgo);

        // Add the given amount of time
        ZonedDateTime tenDaysLater = now.plus(Period.ofDays(10));
        System.out.println("Ten days later: " + tenDaysLater);

    }

}
