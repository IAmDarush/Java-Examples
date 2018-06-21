package main.java.java8features;

/**
 * Created by Darush on 6/18/2018.
 */

@FunctionalInterface
interface sayable {
    void say(String msg);
}

public class FunctionalInterface1 implements sayable{
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterface1 fi1 = new FunctionalInterface1();
        fi1.say("Hello World!");
    }
}
