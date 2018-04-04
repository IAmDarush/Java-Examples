package main.java.innerclass;

public class StaticNestedClassDemo {

    static int data = 40;

    static class Inner {

        void msg() {
            System.out.println("Data = " + data);
        }

        static void staticMethod() {
            System.out.println("Data = " + data);
        }

    }

    public static void main(String[] args) {

        // calling non-static method with object instance
        StaticNestedClassDemo.Inner inner = new StaticNestedClassDemo.Inner();
        inner.msg();

        // Calling the static method without any object instance
        StaticNestedClassDemo.Inner.staticMethod();

    }

}
