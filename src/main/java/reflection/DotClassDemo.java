package main.java.reflection;

public class DotClassDemo {
    public static void main(String[] args) {

        Class c = boolean.class;
        System.out.println(c.getName());

        Class c2 = DotClassDemo.class;
        System.out.println(c2.getName());

    }
}
