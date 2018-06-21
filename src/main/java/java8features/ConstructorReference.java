package main.java.java8features;

/**
 * Created by Darush on 6/16/2018.
 */

interface Messageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.println(msg);
    }
}

public class ConstructorReference {

    public static void main(String[] args) {

        Messageable messageable = Message::new;
        messageable.getMessage("Hello, world!");

    }

}
