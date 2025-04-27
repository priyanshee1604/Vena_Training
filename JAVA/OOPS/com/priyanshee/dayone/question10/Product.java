package com.priyanshee.dayone.question10;

public class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getProductByName() {
        return name;
    }

    public void displayingProducts() {
        System.out.println("id " + id);
        System.out.println("Name " + name);
        System.out.println("Price " + price);
        System.out.println("------------------");
    }

    public int getPrice() {
        return  price;
    }

    public String getName() {
        return name;
    }
}
