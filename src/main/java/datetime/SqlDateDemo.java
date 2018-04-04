package main.java.datetime;

import java.sql.Date;

public class SqlDateDemo {

    public static void main(String[] args) {

        // Get current date
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.println(date);

        // Get date from string
        String str = "2018-03-16";
        Date date1 = Date.valueOf(str);
        System.out.println(date1);

    }

}
