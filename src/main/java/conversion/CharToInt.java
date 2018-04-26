package main.java.conversion;

public class CharToInt {

    public static void main(String[] args) {

        char c = 'c';
        char c2 = '1';

        int i = c; // ASCII value of character
        int i2 = Character.getNumericValue(c2);
        int i3 = Integer.parseInt(String.valueOf(c2));

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);


    }

}
