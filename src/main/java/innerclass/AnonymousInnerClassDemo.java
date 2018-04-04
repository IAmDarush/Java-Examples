package main.java.innerclass;

abstract class Person {
    abstract void eat();
}

public class AnonymousInnerClassDemo {

    public static void main(String[] args) {

        Person person = new Person() {
            @Override
            void eat() {
                System.out.println("I am eating...");
            }
        };

        person.eat();

    }

}


