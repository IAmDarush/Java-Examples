import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        String dateToString = DateFormat.getInstance().format(currentDate);
        System.out.println("Date format using getInstance(): " + dateToString);

        String datePart = DateFormat.getDateInstance().format(currentDate);
        System.out.println("Date part: " + datePart);

        String timePart = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("Time part: " + timePart);

        String dateTime = DateFormat.getDateTimeInstance().format(currentDate);
        System.out.println("Date and Time: " + dateTime);

        String mediumTime = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
        System.out.println("Medium time: " + mediumTime);

        String longTime = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
        System.out.println("Long time: " + longTime);

        String dateTimeLongShort = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(currentDate);
        System.out.println("Long date Short time: " + dateTimeLongShort);

        String dateToParse = "20 Mar, 2018";
        DateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
        try {
            Date parsedDate = dateFormat.parse(dateToParse);
            System.out.println("Parsed date string: " + parsedDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
