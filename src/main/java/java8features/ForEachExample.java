package main.java.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darush on 7/26/2018.
 */
public class ForEachExample {

    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Water Melon");
        fruitList.add("Pineapple");

        System.out.println("Iterating using lambda expression:------");
        fruitList.forEach(fruit -> System.out.println(fruit));

        System.out.println("Iterating using method reference:------");
        fruitList.forEach(System.out::println);

    }

}
