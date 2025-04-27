package com.priyanshee.dayone.question10;

public class Store {
    Product[] products;

    public Store(Product[] products) {
        this.products = products;
    }

    public void displayAllProducts() {
        System.out.println("Displaying all the products: ");
        System.out.println("-----------------------");
        for(int i = 0; i<products.length; i++) {
            products[i].displayingProducts();
        }
    }

    public Product highestPriceProd() {
        if(products.length == 0) return null;

        Product highest = products[0];
        for(int i = 0; i < products.length; i++) {
            if(products[i].getPrice() > highest.getPrice()) {
                highest = products[i];
            }
        }
        return highest;
    }

    public Product searchProductByName(String name) {
        for(int i = 0; i < products.length; i++) {
            if(products[i].getName().equalsIgnoreCase(name))
                return products[i];
        }
        return null;
    }
}
