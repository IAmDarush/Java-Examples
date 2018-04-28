package main.java.conversion;

public class IntToChar {

    public static void main(String[] args) {

        int i = 65;
        char c = (char) i;
        System.out.println(c);

        int i1 = 1;
        char c1 = (char)(i1 + '0');
        System.out.println(c1);

        int i2 = '1';
        char c2 = (char) i2;
        System.out.println(c2);

    }

}
