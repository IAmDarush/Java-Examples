package main.java.conversion;

public class intToString {

    public static void main(String[] args) {

        int i = 20;
        String s1 = String.valueOf(i); // 1st way
        String s2 = Integer.toString(i); // 2nd way
        String s3 = String.format("%d", i); // 3rd way

        System.out.println(10 + i); // 30 because i is int
        System.out.println(10 + s1); // 1020 because s is String
        System.out.println(10 + s2); // 1020 because s is String
        System.out.println(10 + s3); // 1020 because s is String

    }

}
