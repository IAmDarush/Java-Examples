import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DayOfWeekDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2018, Month.MARCH, 13);

        // Get the value of day-of-wekk
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));

        // Obtain an instance of DayOfWeek from the given int value
        DayOfWeek friday = DayOfWeek.of(5);
        // Get the text name of the DayOfWeek
        System.out.println(friday.name());
        // Get the position of the DayOfWeek in the enum
        System.out.println(friday.ordinal());
        // Get the actual value of this DayOfWeek based on 1-7
        System.out.println(friday.getValue());

        // Subtract
        System.out.println(friday.minus(1).name());;
        // Add
        System.out.println(friday.plus(1).name());

    }

}
