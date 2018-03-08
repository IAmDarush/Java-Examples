import java.time.LocalDate;
import java.time.Year;

public class YearDemo {

    public static void main(String[] args) {

        // Obtain the current year
        Year year = Year.now();
        System.out.println(year);

        // Combine the given year and day to construct a local date
        Year year1 = Year.of(2017);
        LocalDate localDate = year1.atDay(123);
        System.out.println(localDate);

        // Get the length of this year in days
        System.out.println(year1.length());

        // Check if this year is leap
        System.out.println(year1.isLeap());

    }

}
