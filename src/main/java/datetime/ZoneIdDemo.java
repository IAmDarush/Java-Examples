package main.java.datetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdDemo {

    public static void main(String[] args) {

        // Get zone-id of Kabul and Kolkata
        ZoneId zoneId1 = ZoneId.of("Asia/Kabul");
        ZoneId zoneid2 = ZoneId.of("Asia/Kolkata");

        // Get the time in those zone-ids
        LocalTime time1 = LocalTime.now(zoneId1);
        LocalTime time2 = LocalTime.now(zoneid2);

        System.out.println(time1);
        System.out.println(time2);

        // Check if time1 is coming before time2
        System.out.println(time1.isBefore(time2));

        // Get current system zone-id
        ZoneId system = ZoneId.systemDefault();
        System.out.println(system);
        System.out.println(system.getId());

        // Get the textual representation of the time-zone
        System.out.println(system.getDisplayName(TextStyle.FULL, Locale.ROOT));

    }

}
