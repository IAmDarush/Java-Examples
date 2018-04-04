package main.java.internationalization;

import java.util.Locale;

public class LocaleDemo1 {

    public static void main(String[] args) {

        Locale enLocale = new Locale("en", "US");
        Locale frLocale = new Locale("fr", "FR");
        Locale esLocale = new Locale("es", "ES");
        Locale faLocale = new Locale("fa", "AF");

        System.out.println("English language name: " + enLocale.getDisplayLanguage());
        System.out.println("English language name in French: " +
                enLocale.getDisplayLanguage(frLocale));
        System.out.println("English language name in Spanish: " +
                enLocale.getDisplayLanguage(esLocale));
        System.out.println("English language name in Persian: " +
                enLocale.getDisplayLanguage(faLocale));

    }

}
