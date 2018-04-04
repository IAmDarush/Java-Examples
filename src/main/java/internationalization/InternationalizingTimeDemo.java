package main.java.internationalization;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalizingTimeDemo {

    public static void main(String[] args) {

        printTime(Locale.UK);
        printTime(Locale.US);
        printTime(Locale.FRANCE);
        printTime(Locale.CHINA);

    }

    static void printTime(Locale locale) {
        DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        String time = formatter.format(new Date());
        System.out.println(time + " in locale " + locale);
    }
}
