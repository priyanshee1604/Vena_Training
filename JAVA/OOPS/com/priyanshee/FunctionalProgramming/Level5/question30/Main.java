package com.priyanshee.FunctionalProgramming.Level5.question30;

//30.	Implement a function pipeline to process orders (e.g., filter by status, sort by amount, map to customer name).
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>(List.of(
                new Order(1, "Alice", 250.0, "COMPLETED"),
                new Order(2, "Bob", 150.0, "PENDING"),
                new Order(3, "Charlie", 300.0, "COMPLETED"),
                new Order(4, "Diana", 100.0, "CANCELLED"),
                new Order(5, "Evan", 200.0, "COMPLETED")
        ));

        orders.stream().filter( order -> order.getStatus().equals("COMPLETED")).sorted(Comparator.comparing(Order::getAmount)).map(Order::getCustomerName).forEach(System.out::println);
    }
}
