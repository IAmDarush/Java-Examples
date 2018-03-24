import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();

        System.out.println("Display country: " + locale.getDisplayCountry());
        System.out.println("Display Language: " + locale.getDisplayLanguage());
        System.out.println("Display Name: " + locale.getDisplayName());
        System.out.println("ISO3 Country Name: " + locale.getISO3Country());
        System.out.println("ISO3 Language Name: " + locale.getISO3Language());
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());

        //Get a specific locale
        Locale specificLocale = new Locale("Fa", "Af");
        System.out.println("Display country: " + specificLocale.getDisplayCountry());
        System.out.println("Display language: " + specificLocale.getDisplayLanguage());

    }

}
