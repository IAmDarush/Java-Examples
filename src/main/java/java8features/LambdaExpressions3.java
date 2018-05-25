package main.java.java8features;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.forEach((element) -> System.out.println(element));

    }

}
