package main.java.conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

    public static void main(String[] args) {

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateString = dateFormatter.format(date);
        System.out.println(dateString);

    }

}
