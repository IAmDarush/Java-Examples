package main.java.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample3 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Apple", 23000f));
        productList.add(new Product(2, "Dell", 34000f));
        productList.add(new Product(3, "Sony", 13000f));
        productList.add(new Product(4, "HP", 3000f));
        productList.add(new Product(5, "Lenovo", 23000f));

        Double sumOfPrices = productList.stream()
                .collect(Collectors.summingDouble(product -> product.price));

        System.out.println("Sum of prices: " + sumOfPrices);

        Integer sumOfIds = productList.stream()
                .collect(Collectors.summingInt(product -> product.id));

        System.out.println("Sum of IDs: " + sumOfIds);

    }

}
