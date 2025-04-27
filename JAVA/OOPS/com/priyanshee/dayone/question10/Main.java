package com.priyanshee.dayone.question10;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "toothbrush", 25),
            new Product(2, "toothpaste", 100),
            new Product(3, "hair comb", 40),
            new Product(4, "serum", 600),
            new Product(5, "body lotion", 800)
        };

        Store store = new Store(products);

        store.displayAllProducts();
        System.out.println("Highest price product: " + store.highestPriceProd().getName());
        System.out.println("Search for product hair comb: " + store.searchProductByName("hair comb").getName());
        System.out.println("Searching for non exiting product: " + store.searchProductByName("hairs"));
    }
}
