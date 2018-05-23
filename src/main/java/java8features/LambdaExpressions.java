package main.java.java8features;

interface Drawable {
    void draw();
}

interface Sayable {
    String say();
}

public class LambdaExpressions {

    public static void main(String[] args) {

        int width = 10;

        Drawable d = () -> System.out.println("Drawing " + width);
        d.draw();

        // With return statement
        Sayable s = () -> {
            return "I am saying something...";
        };
        System.out.println(s.say());

        // Without return statement
        Sayable s1 = () -> "I am saying something else...";
        System.out.println(s1.say());

    }

}
