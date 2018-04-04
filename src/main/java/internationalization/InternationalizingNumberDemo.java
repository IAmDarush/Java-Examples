package main.java.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class InternationalizingNumberDemo {

    public static void main(String[] args) {

        printNumber(Locale.US);
        printNumber(Locale.CHINA);
        printNumber(Locale.JAPAN);

    }

    static void printNumber(Locale locale) {

        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
        String number = formatter.format(123000.0001);
        System.out.println(number + " for the locale " + locale);

    }

}
