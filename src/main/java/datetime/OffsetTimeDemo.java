package main.java.datetime;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffsetTimeDemo {

    public static void main(String[] args) {

        OffsetTime offset = OffsetTime.now();

        // Units of time based on their closer unit
        int hour = offset.getHour();
        int minute = offset.getMinute();
        int second = offset.getSecond();

        System.out.println("Hour Of Day: " + hour);
        System.out.println("Minute Of Hour: " + minute);
        System.out.println("Second Of Minute: " + second);

        // Units of time based on day
        int hour1 = offset.get(ChronoField.HOUR_OF_DAY);
        int minute1  = offset.get(ChronoField.MINUTE_OF_DAY);
        int second1 = offset.get(ChronoField.SECOND_OF_DAY);

        System.out.println("Hour Of Day: " + hour1);
        System.out.println("Minute Of Day " + minute1);
        System.out.println("Second Of Day " + second1);




    }

}
