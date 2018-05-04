package main.java.conversion;

public class BooleanToString {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        String s1 = String.valueOf(b1);
        String s2 = Boolean.toString(b2);

        System.out.println(s1);
        System.out.println(s2);

    }

}
