import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(date);
        System.out.println("Date with format yyyy-MM-dd : " + dateString);

        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateString = formatter.format(date);
        System.out.println("Date with format yyyy-MM-dd HH:m:ss : " + dateString);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        dateString = formatter.format(date);
        System.out.println("Date with format dd MMMM yyyy : " + dateString);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        dateString = formatter.format(date);
        System.out.println("Date with format dd MMMM yyyy zzzz : " + dateString);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        dateString = formatter.format(date);
        System.out.println("Date with format E, dd MMM yyyy HH:mm:ss z : " + dateString);

        // Converting String to Date
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date parsedDate = formatter.parse("21/03/2018");
            System.out.println("Parsed date is : " + parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
