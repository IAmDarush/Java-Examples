package main.java.innerclass;

interface Eatable {
    void eat();
}

public class AnonymousInnerClassInterfaceDemo {

    public static void main(String[] args) {

        Eatable eatable = new Eatable() {
            public void eat() {
                System.out.println("I am eating...");
            }
        };

        eatable.eat();

    }

}
