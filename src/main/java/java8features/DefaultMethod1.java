package main.java.java8features;

/**
 * Created by Darush on 7/23/2018.
 */

interface Sayable1 {
    // Default method
    default void say() {
        System.out.println("Hello, This is a default method");
    }

    // Abstract method
    void sayMore(String message);
}

public class DefaultMethod1 implements Sayable1 {

    public static void main(String[] args) {

        DefaultMethod1 defaultMethod = new DefaultMethod1();
        defaultMethod.say();
        defaultMethod.sayMore("Say more");

    }

    @Override
    public void sayMore(String message) {
        System.out.println(message);
    }
}
