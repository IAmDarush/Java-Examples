package main.java.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Product-1", 10000f));
        productList.add(new Product(2, "Product-2", 24000f));
        productList.add(new Product(3, "Product-3", 30000f));
        productList.add(new Product(4, "Product-4", 19000f));

        List<Float> productPriceList = productList.stream()
                .filter(product -> product.price > 20000f)
                .map(product -> product.price)
                .collect(Collectors.toList());

        System.out.println(productPriceList);

    }

}
