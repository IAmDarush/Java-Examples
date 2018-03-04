import java.time.Clock;
import java.time.Duration;

public class ClockDemo {

    public static void main(String[] args) {

        // Obtain best available system clock in the default time zone
        Clock clock = Clock.systemDefaultZone();

        // Get the current time zone
        System.out.println("Time Zone: " + clock.getZone()); // Time Zone: Asia/Kolkata

        // Obtain best available system clock and convert it to UTC time zone
        clock = Clock.systemUTC();
        System.out.println(clock.instant());// 2018-03-04T07:42:54.346018Z

        // The duration to add to clock
        Duration duration = Duration.ofHours(5);
        // Create a new clock instance with the given clock and duration
        Clock clockWithOffset = Clock.offset(clock, duration);
        System.out.println(clockWithOffset.instant());// 2018-03-04T12:42:54.357850Z

    }

}
