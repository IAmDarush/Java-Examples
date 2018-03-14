import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class MonthDemo {

    public static void main(String[] args) {

        // Construct a Month instance with the given string
        Month month = Month.valueOf("January".toUpperCase());
        System.out.printf("For the month %s all Sundays are :\n", month);

        // Construct a LocalDate instance with the provided data
        LocalDate localDate = Year.now()
                .atMonth(month)
                .atDay(1)
                // Find the first Sunday of the month
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));

        // Get the Month instance from the above LocalDate
        Month mi = localDate.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", localDate);
            // Find the next Sunday in the current LocalDate instance
            localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
            mi = localDate.getMonth();
        }

        // Get current month's int value and string text
        Month currentMonth = Month.from(LocalDate.now());
        System.out.println(currentMonth.getValue());
        System.out.println(currentMonth.name());

        // Addition and Subtraction
        System.out.println(currentMonth.minus(1));
        System.out.println(currentMonth.plus(1));

        // Get number of days in current month
        System.out.println("Number of days: " + currentMonth.length(true));

    }

}
