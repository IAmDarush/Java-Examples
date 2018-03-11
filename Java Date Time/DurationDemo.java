import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {

    public static void main(String[] args) {

        // find the amount of seconds between 12:00 noon and before 00:00 midnight
        Duration duration = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(duration.get(ChronoUnit.SECONDS)); // 43199

        // check if duration is negative
        Duration negativeDuration = Duration.between(LocalTime.MAX, LocalTime.NOON);
        System.out.println(negativeDuration.isNegative());

        // add and subtract
        Duration minusDuration = duration.minus(Duration.ofHours(10));
        Duration plusDuration = duration.plus(Duration.ofHours(10));
        System.out.println("Normal duration: " + duration);
        System.out.println("Minus 10 hours: " + minusDuration);
        System.out.println("Plus 10 hours: " + plusDuration);
    }

}
