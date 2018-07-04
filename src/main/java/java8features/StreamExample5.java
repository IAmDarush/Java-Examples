package main.java.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darush on 7/4/2018.
 */
public class StreamExample5 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Dell", 23000f));
        productList.add(new Product(2, "Lenovo", 12000f));
        productList.add(new Product(3, "HP", 35000f));
        productList.add(new Product(4, "Sony", 9000f));

        // Find product with maximum price
        Product productMax = productList.stream()
                .max((product1, product2) ->
                        product1.price > product2.price ? 1 : -1).get();
        System.out.println("Maximum price: " + productMax.price);

        // Find product with minimum price
        Product productMin = productList.stream()
                .min((product1, product2) ->
                product1.price > product2.price? 1 : -1).get();
        System.out.println("Minimum price: " + productMin.price);

    }

}
