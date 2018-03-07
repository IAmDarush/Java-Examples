import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class ZoneOffsetDemo {

    public static void main(String[] args) {

        ZoneOffset zoneOffset = ZoneOffset.UTC;
        Temporal temporal = zoneOffset.adjustInto(ZonedDateTime.now());
        System.out.println(temporal);

        // Construct an instance of ZoneOffset
        ZoneOffset zoneOffset1 = ZoneOffset.ofHours(5);
        System.out.println(zoneOffset1);

        ZoneOffset zoneOffset2 = ZoneOffset.ofHoursMinutes(5, 30);
        System.out.println(zoneOffset2);

        // Check if the offset can be queried for the specified field
        boolean b1 = zoneOffset.isSupported(ChronoField.OFFSET_SECONDS);
        boolean b2 = zoneOffset.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(b1);
        System.out.println(b2);



    }

}
