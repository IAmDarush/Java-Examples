import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {

        // Get current date and time
        Date date = new Date();
        System.out.println(date);

        // Get current date and time
        long millis = System.currentTimeMillis();
        Date date1 = new Date(millis);
        System.out.println(date1);

    }

}
