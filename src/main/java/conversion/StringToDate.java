package main.java.conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) {

        String string = "2018/04/11";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = formatter.parse(string);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
