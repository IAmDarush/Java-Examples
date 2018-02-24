import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateDemo {

    public static void main(String[] args) {

        //Get current date
        LocalDate now = LocalDate.now();
        LocalDate yesterday = now.minusDays(1);
        LocalDate tomorrow = now.plusDays(1);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Today: " + now);
        System.out.println("Tomorrow: " + tomorrow);

        //Check for leap year
        LocalDate leap1 = LocalDate.of(1904,1,1);
        LocalDate leap2 = LocalDate.of(1900,1,1);
        boolean isLeapYear1 = leap1.isLeapYear();
        boolean isLeapYear2 = leap2.isLeapYear();
        System.out.println(leap1 + " is Leap Year: " + isLeapYear1);
        System.out.println(leap2 + " is Leap Year: " + isLeapYear2);

        //Combine the date with a time
        LocalDate givenDate = LocalDate.of(2018, 2, 24);
        LocalDateTime dateTime = givenDate.atTime(21, 23, 54);
        System.out.println(dateTime);
    }

}
