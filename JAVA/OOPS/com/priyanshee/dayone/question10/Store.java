package com.priyanshee.dayone.question10;

public class Store {
    private final Product[] products;

    public Store(Product[] products) {
        this.products = products;
    }

    public void displayAllProducts() {
        System.out.println("Displaying all the products: ");
        System.out.println("-----------------------");
        for (Product product : products) {
            product.displayingProducts();
        }
    }

    public Product highestPriceProd() {
        if(products.length == 0) return null;

        Product highest = products[0];
        for (Product product : products) {
            if (product.getPrice() > highest.getPrice()) {
                highest = product;
            }
        }
        return highest;
    }

    public Product searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name))
                return product;
        }
        return null;
    }
}
