package main.java.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darush on 6/27/2018.
 */
public class StreamExample3 {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Sony laptop", 12000f));
        productList.add(new Product(2, "Dell Laptop", 24000f));
        productList.add(new Product(3, "Apple Laptop", 25000f));
        productList.add(new Product(4, "Lenovo Laptop", 4000f));

        Float totalPrice = productList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price);
        System.out.println(totalPrice);

        float totalPrice2 = productList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);
        System.out.println(totalPrice2);

    }

}
