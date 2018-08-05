package main.java.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample1 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Apple", 23000f));
        productList.add(new Product(2, "Samsung", 12000f));
        productList.add(new Product(3, "HTC", 29000f));
        productList.add(new Product(4, "Sony", 45000f));

        List<Float> productPriceList = productList.stream()
                .map(product -> product.price)
                .collect(Collectors.toList());

        System.out.println(productPriceList);

    }

}
