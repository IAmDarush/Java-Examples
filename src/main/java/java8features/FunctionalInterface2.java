package main.java.java8features;

/**
 * Created by Darush on 6/20/2018.
 */
interface Doable{
    default void doIt(){
        System.out.println("Do it now!");
    }
}

@FunctionalInterface
interface Speakable extends Doable{
    void speak(String msg);   // abstract method
}

public class FunctionalInterface2 implements Speakable{

    public void speak(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterface2 fi = new FunctionalInterface2();
        fi.speak("Can you please");
        fi.doIt();
    }
}
