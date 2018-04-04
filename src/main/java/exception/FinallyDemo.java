package main.java.exception;

public class FinallyDemo {

    public static void main(String[] args) {

        // exception doesn't occur
        try {
            int data = 30/6;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }

        //exception occurs but not handled
        try {
            int data = 30/0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("Outside try-catch");

    }

}
