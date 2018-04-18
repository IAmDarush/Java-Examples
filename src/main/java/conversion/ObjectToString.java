package main.java.conversion;

public class ObjectToString {

    public static void main(String[] args) {

        MyClass myObj = new MyClass();
        String myStr = myObj.toString();
        String myStr1 = String.valueOf(myObj);

        System.out.println(myStr);
        System.out.println(myStr1);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        System.out.println(reverse);

    }

}

class MyClass {}