package main.java.conversion;

public class IntToDouble {

    public static void main(String[] args) {

        // First way is implicit
        int i = 30;
        double double1 = i;
        System.out.println(double1);

        // Second way
        Double double2 = new Double(i);
        System.out.println(double2);

        // Third way
        Double double3 = Double.valueOf(i);
        System.out.println(double3);


    }

}
