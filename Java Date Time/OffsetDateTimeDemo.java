import java.time.OffsetDateTime;

public class OffsetDateTimeDemo {

    public static void main(String[] args) {

        // Get current time
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);// 2018-03-03T13:42:24.708259+05:30

        // Get a specific unit of time
        System.out.println(offsetDateTime.getDayOfMonth()); // 3
        System.out.println(offsetDateTime.getDayOfYear()); // 62
        System.out.println(offsetDateTime.getDayOfWeek()); // SATURDAY

        // Get the date part only
        System.out.println(offsetDateTime.toLocalDate()); // 2018-03-03

        // Add or subtract days
        System.out.println(offsetDateTime.minusDays(365)); // 2017-03-03T13:42:24.708259+05:30
        System.out.println(offsetDateTime.plusDays(365)); // 2019-03-03T13:42:24.708259+05:30

    }

}
