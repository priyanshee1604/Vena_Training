package com.priyanshee.Collections.question5;

//Create a Product class with id, name, price, rating, and stock.
public class Product {
    private int id;
    private String name;
    private  double price;
    private double rating;
    private int stock;

    public Product(int id, String name, double price, double rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + rating + " " + stock + "\n";
    }
}

