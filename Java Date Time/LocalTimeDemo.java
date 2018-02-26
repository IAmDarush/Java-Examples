import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {

    public static void main(String[] args) {

        // Get current time
        LocalTime time = LocalTime.now();
        System.out.println(time); // Output sample: 22:09:14.085724

        // Create an instance of LocalTime with the given data
        LocalTime time2 = LocalTime.of(22, 10, 55);
        System.out.println(time2);

        // Addition and Subtraction of hours and minutes
        LocalTime time3 = time2.minusHours(1).minusMinutes(5);
        System.out.println(time3 + " : Subtract 1 hour and 5 minutes");
        LocalTime time4 = time3.plusHours(1).plusMinutes(5);
        System.out.println(time4 + " : Add 1 hour and 5 minutes");

    }

}
