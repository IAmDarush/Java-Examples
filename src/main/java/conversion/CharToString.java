package main.java.conversion;

public class CharToString {

    public static void main(String[] args) {

        char c = 'C';
        String s = String.valueOf(c);
        String s1 = Character.toString(c);

        System.out.println(s);
        System.out.println(s1);

    }

}
