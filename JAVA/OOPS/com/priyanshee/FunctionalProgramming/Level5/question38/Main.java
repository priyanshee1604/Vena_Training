package com.priyanshee.FunctionalProgramming.Level5.question38;
//Go through propelry once more.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("iPhone", "Electronics", 4.5),
                new Product("Samsung TV", "Electronics", 4.7),
                new Product("Dell Laptop", "Electronics", 4.3),
                new Product("Jeans", "Clothing", 4.2),
                new Product("T-Shirt", "Clothing", 4.6),
                new Product("Running Shoes", "Footwear", 4.4))
        );

        Map<String, String> topRatedByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                opt -> opt.map(Product::getName).orElse("N/A")
                        )
                ));

        System.out.println(topRatedByCategory);
    }
}
