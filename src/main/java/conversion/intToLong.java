package main.java.conversion;

public class intToLong {

    public static void main(String[] args) {

        int i = 100;

        Long long1 = new Long(i);
        Long long2 = Long.valueOf(i);
        long long3 = i;

        System.out.println(long1);
        System.out.println(long2);
        System.out.println(long3);

    }

}
