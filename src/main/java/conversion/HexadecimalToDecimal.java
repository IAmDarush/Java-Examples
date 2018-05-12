package main.java.conversion;

public class HexadecimalToDecimal {

    public static void main(String[] args) {

        String hex = "f";
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);

    }

}
