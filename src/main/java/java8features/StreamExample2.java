package main.java.java8features;

import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {

        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);


    }
}
