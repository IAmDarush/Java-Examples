package main.java.conversion;

public class StringToBoolean {

    public static void main(String[] args) {

        String s1 = "true";
        String s2 = "tRuE";
        String s3 = "correct";

        boolean b1 = Boolean.parseBoolean(s1);
        boolean b2 = Boolean.parseBoolean(s2);
        boolean b3 = Boolean.parseBoolean(s3);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Boolean booleanObject1 = Boolean.valueOf(s1);
        Boolean booleanObject2 = Boolean.valueOf(s2);
        Boolean booleanObject3 = Boolean.valueOf(s3);

        System.out.println(booleanObject1);
        System.out.println(booleanObject2);
        System.out.println(booleanObject3);

    }

}
