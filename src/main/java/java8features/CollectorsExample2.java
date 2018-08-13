package main.java.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample2 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Apple", 23000f));
        productList.add(new Product(2, "Dell", 34000f));
        productList.add(new Product(3, "Sony", 13000f));
        productList.add(new Product(4, "HP", 3000f));
        productList.add(new Product(4, "Lenovo", 23000f));

        Set<Float> productPriceList = productList.stream()
                .map(product -> product.price)
                .collect(Collectors.toSet());

        System.out.println(productPriceList);

    }

}
