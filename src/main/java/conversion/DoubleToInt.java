package main.java.conversion;

public class DoubleToInt {

    public static void main(String[] args) {

        double d = 3.14;
        int i = (int) d;
        System.out.println(i);

        Double d2 = new Double(3.14);
        int i2 = d2.intValue();
        System.out.println(i2);

    }

}
