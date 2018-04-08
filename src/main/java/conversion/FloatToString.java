package main.java.conversion;

public class FloatToString {

    public static void main(String[] args) {

        float f = 1.2F;
        String s = String.valueOf(f);
        String s1 = Float.toString(f);

        System.out.println(s + 10);
        System.out.println(s1 + 10);

    }

}
