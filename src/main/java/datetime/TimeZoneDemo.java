package main.java.datetime;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneDemo {

    public static void main(String[] args) {

        // Get the list of all available IDs in TimeZone class
        String[]  ids = TimeZone.getAvailableIDs();
        System.out.println("Available IDS: ");
        for (String id : ids) {
            System.out.println(id);
        }

        // Get the amount of offset in milliseconds
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Kabul");
        System.out.println("Offset value of TimeZone: "
                + timeZone.getOffset(Calendar.ZONE_OFFSET));

        System.out.println("Time zone ID is : " + timeZone.getID());
        System.out.println("Time zone display name is : " + timeZone.getDisplayName());

    }

}
