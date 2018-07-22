package main.java.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions5 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Apple Laptop", 30000f));
        list.add(new Product(2, "Mouse", 12000f));
        list.add(new Product(3, "Keyboard", 15000f));

        System.out.println("Sort by name:");

        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }

}
