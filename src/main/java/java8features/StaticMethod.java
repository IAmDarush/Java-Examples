package main.java.java8features;

/**
 * Created by Darush on 7/25/2018.
 */
interface Sayable2 {
    // default method
    default void say() {
        System.out.println("This is the default method");
    }

    // abstract method
    void sayMore(String msg);

    // static method
    static void sayLouder(String msg) {
        System.out.println(msg);
    }

}
public class StaticMethod implements Sayable2{

    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {

        StaticMethod staticMethod = new StaticMethod();
        staticMethod.say();
        staticMethod.sayMore("Say more");
        Sayable2.sayLouder("Say louder");

    }
}
