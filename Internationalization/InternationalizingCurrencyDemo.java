import java.text.NumberFormat;
import java.util.Locale;

public class InternationalizingCurrencyDemo {

    static void printCurrency(Locale locale) {

        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currency = formatter.format(123000.1234);
        System.out.println(currency + " for locale " + locale);
    }

    public static void main(String[] args) {
        printCurrency(Locale.FRANCE);
        printCurrency(Locale.CHINA);
        printCurrency(Locale.JAPAN);
        printCurrency(Locale.US);
    }

}
