package main.java.conversion;

public class StringToDouble {

    public static void main(String[] args) {

        String s = "3.14";
        double d = Double.parseDouble(s);

        // Add 1 to see if it is added or concatenated
        System.out.println(d + 1);

    }

}
