package main.java.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Darush on 7/7/2018.
 */
public class StreamExample7 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Dell", 23000f));
        productList.add(new Product(2, "Lenovo", 12000f));
        productList.add(new Product(3, "HP", 35000f));
        productList.add(new Product(4, "Sony", 9000f));

        List<Float> productPriceList = productList.stream()
                .filter(product -> product.price > 10000)
                .map(Product::getPrice) // User method reference
                .collect(Collectors.toList());

        System.out.println(productPriceList);

    }

}
