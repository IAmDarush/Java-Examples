package main.java.exception;

public class TryCatchDemo {

    public static void main(String[] args) {

        try {
            int result = 30/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Rest of the code...");

    }

}
