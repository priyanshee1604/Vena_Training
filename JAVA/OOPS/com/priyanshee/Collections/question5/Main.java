package com.priyanshee.Collections.question5;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //
        Map<Integer, Product> catalog = new TreeMap<>();
        catalog.put(101, new Product(101, "Laptop", 75000.0, 4.5, 10));
        catalog.put(102, new Product(102, "Smartphone", 45000.0, 4.3, 25));
        catalog.put(103, new Product(103, "Headphones", 1500.0, 4.0, 100));
        catalog.put(106, new Product(106, "Headphone", 1500.0, 4.0, 100));
        catalog.put(104, new Product(104, "Keyboard", 1200.0, 3.9, 50));
        catalog.put(105, new Product(105, "Monitor", 12000.0, 4.6, 20));
        System.out.println(catalog);
        System.out.println("------------");
        catalog.values().stream().sorted(Comparator.comparing(Product::getRating).reversed().thenComparing(Product::getName)).forEach(System.out::println);

    }
}
