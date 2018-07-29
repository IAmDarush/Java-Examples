package main.java.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darush on 7/30/2018.
 */
public class ForEachOrderedExample {

    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Pineapple");
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Melon");
        fruitList.add("Watermelon");

        System.out.println("-----Iterate using lambda expressions-----");
        fruitList.stream().forEachOrdered(fruit -> System.out.println(fruit));

        System.out.println("----Iterate using method reference-----");
        fruitList.stream().forEachOrdered(System.out::println);

    }

}
