package main.java.java8features;

public class MethodReference2 {

    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        Thread thread = new Thread(MethodReference2::ThreadStatus);
        thread.start();

    }

}
