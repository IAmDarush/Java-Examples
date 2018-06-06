package main.java.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressions6 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Samsung", 10000f));
        list.add(new Product(2, "Iphone5", 20000f));
        list.add(new Product(3, "Iphone6", 30000f));
        list.add(new Product(3, "Iphone7", 40000f));

        Stream<Product> filtered_data = list.stream()
                .filter(product -> product.price > 20000);

        filtered_data.forEach(product ->
                System.out.println(product.name + ":" + product.price));


    }

}
