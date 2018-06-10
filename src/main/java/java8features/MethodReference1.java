package main.java.java8features;

interface Talkable {
    void talk();
}

public class MethodReference1 {

    public static void talkSomething() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {

        Talkable talkable = MethodReference1::talkSomething;
        talkable.talk();

    }
}
