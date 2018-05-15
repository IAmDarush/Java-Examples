package main.java.conversion;

public class OctalToDecimal {

    public static void main(String[] args) {

        String octal = "121";
        int decimal = Integer.parseInt(octal, 8);
        System.out.println(decimal);

    }

}
