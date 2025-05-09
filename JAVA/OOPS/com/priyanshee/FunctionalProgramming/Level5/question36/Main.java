package com.priyanshee.FunctionalProgramming.Level5.question36;

//Go through once again.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>(List.of(
                new Order(List.of(new Item("Pen"), new Item("Notebook"))),
                new Order(List.of(new Item("Pencil"), new Item("Eraser"))),
                new Order(List.of(new Item("Marker")))
        ));

        System.out.println(orders.stream().flatMap(order -> order.getItems().stream()).map(Item::getName).toList());
    }
}
