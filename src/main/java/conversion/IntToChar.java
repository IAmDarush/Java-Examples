package main.java.conversion;

public class IntToChar {

    public static void main(String[] args) {

        // Get the ASCII character corresponding to this int value
        int i = 65;
        char c = (char) i;
        System.out.println(c);

        //Get the actual character value of int value by adding
        // 48 which is the ASCII value of '0'
        int i1 = 1;
        char c1 = (char)(i1 + '0');
        System.out.println(c1);

        // Storing integer in single quote will store actual character in char variable
        int i2 = '1';
        char c2 = (char) i2;
        System.out.println(c2);

        // using Character.forDigit() method
        int radix = 10;
        int i3 = 1;
        char c3 = Character.forDigit(i3, radix);
        System.out.println(c3);

        // Get the hex value of the given int
        int radix1 = 16;
        int i4 = 10;
        char c4 = Character.forDigit(i4, radix1);
        System.out.println(c4);

    }

}
