package main.java.conversion;

public class LongToString {

    public static void main(String[] args) {

        long l = 1234567890L;

        String s = String.valueOf(l);
        String s1 = Long.toString(l);

        System.out.println(s);
        System.out.println(s1);

    }

}
