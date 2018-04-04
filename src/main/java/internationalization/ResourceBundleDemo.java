package main.java.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
        System.out.println("Message in " + Locale.US + ": " +
                bundle.getString("goodmorning"));

        Locale.setDefault(new Locale("fr", "FR"));
        bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in " + Locale.getDefault() + ": " +
                bundle.getString("goodmorning"));
    }

}
