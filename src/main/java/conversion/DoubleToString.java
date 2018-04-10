package main.java.conversion;

public class DoubleToString {

    public static void main(String[] args) {

        double d = 3.14d;
        String s = Double.toString(d);
        String s1 = String.valueOf(d);

        System.out.println(s + 15);
        System.out.println(s1 + 15);


    }

}
