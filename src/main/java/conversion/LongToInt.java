package main.java.conversion;

public class LongToInt {

    public static void main(String[] args) {

        long longPrimitive = 400;
        int int1 = (int) longPrimitive;
        System.out.println(int1);

        Long longObjet = 400L;
        int int2 = longObjet.intValue();
        System.out.println(int2);

    }

}
