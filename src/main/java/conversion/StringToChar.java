package main.java.conversion;

public class StringToChar {

    public static void main(String[] args) {

        String s = "hello";
        char c = s.charAt(0);
        System.out.println(c);

        char[] charArray = s.toCharArray();
        for (int i=0; i<charArray.length; i++) {
            System.out.println("Character at " + i + " = " + charArray[i]);
        }

    }

}
