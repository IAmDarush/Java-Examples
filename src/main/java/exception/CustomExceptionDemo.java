package main.java.exception;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message){
        super(message);
    }
}


public class CustomExceptionDemo {

    private static void validate(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age is not valid");
        } else {
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(14);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Rest of the code...");
    }

}


