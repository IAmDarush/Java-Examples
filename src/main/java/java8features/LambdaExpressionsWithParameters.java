package main.java.java8features;

interface Addable {

    int add(int a, int b);

}

public class LambdaExpressionsWithParameters {

    public static void main(String[] args) {

        Addable a1 = (a, b) -> (a + b);
        System.out.println(a1.add(10, 20));

        Addable a2 = (int a, int b) -> a + b;
        System.out.println(a2.add(10, 20));
    }

}
