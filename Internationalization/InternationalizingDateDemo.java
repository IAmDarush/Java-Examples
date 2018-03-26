import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalizingDateDemo {

    public static void main(String[] args) {

        // Print date in the given local language
        printDate(Locale.UK); //26 Mar 2018 en_GB
        printDate(Locale.US); //Mar 26, 2018 en_US
        printDate(Locale.FRANCE); //26 mars 2018 fr_FR
        printDate(Locale.CHINESE); //2018年3月26日 zh

    }

    private static void printDate(Locale locale) {
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        Date currentDate = new Date();
        String date = formatter.format(currentDate);
        System.out.println(date + " " + locale);
    }

}
