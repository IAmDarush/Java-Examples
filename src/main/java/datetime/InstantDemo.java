package main.java.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantDemo {

    public static void main(String[] args) {

        // Obtain an instance of Instant from this text string
        Instant instant = Instant.parse("2018-03-12T21:43:30.00Z");
        System.out.println(instant);

        // Current instant
        Instant now = Instant.now();
        System.out.println(now);

        // Subtract
        Instant yesterday = now.minus(Duration.ofDays(1));
        System.out.println(yesterday);

        // Add
        Instant tomorrow = now.plus(Duration.ofDays(1));
        System.out.println(tomorrow);

        // Check if the specified unit is supported
        System.out.println(now.isSupported(ChronoUnit.DAYS));
        System.out.println(now.isSupported(ChronoUnit.YEARS));


    }

}
