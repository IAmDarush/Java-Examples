package main.java.conversion;

import java.sql.Timestamp;
import java.util.Date;

public class DateToTimestamp {

    public static void main(String[] args) {

        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        System.out.println(ts);

    }

}
