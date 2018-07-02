package main.java.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Darush on 7/2/2018.
 */
public class StreamExample4 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Sony", 23000f));
        productList.add(new Product(2, "Dell", 56000f));
        productList.add(new Product(3, "Lenovo", 2000f));
        productList.add(new Product(4, "HP", 19000f));

        double total = productList.stream().collect(Collectors.summingDouble(product -> product.price));
        System.out.println(total);

        double total1 = productList.stream().mapToDouble(product -> product.price).sum();
        System.out.println(total1);

    }
}
