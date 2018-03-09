import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class YearMonthDemo {

    public static void main(String[] args) {

        // Get current year-month
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);

        // Format the instance of year-month
        String formetted = yearMonth.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(formetted);

        // Get a specific field of year-month instance
        long month= yearMonth.get(ChronoField.YEAR);
        long year = yearMonth.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);

        // Add or subtract
        YearMonth yearMonth1 = yearMonth.plus(Period.ofYears(2));
        YearMonth yearMonth2 = yearMonth.minus(Period.ofMonths(2));
        System.out.println("2 years later: " + yearMonth1);
        System.out.println("2 months ago: " + yearMonth2);

    }

}
