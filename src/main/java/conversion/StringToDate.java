package main.java.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) {

        String string = "2018/04/11";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

        String string1 = "Thu, Apr 12 2018 23:18:14";
        SimpleDateFormat formatter1 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");

        try {
            Date date = formatter.parse(string);
            System.out.println(date);

            Date date1 = formatter1.parse(string1);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
