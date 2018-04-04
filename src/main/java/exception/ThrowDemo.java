package main.java.exception;

public class ThrowDemo {

    public static void main(String[] args) {

        validate(13);
        System.out.println("Welcome to vote");

    }

    static void validate(int age) {
        if(age <18) {
            throw new ArithmeticException("Not valid integer");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

}
