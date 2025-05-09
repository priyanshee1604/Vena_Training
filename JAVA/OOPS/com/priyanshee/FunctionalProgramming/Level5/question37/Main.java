package com.priyanshee.FunctionalProgramming.Level5.question37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>(List.of(
                new Order(List.of(new Item("Pen", 10), new Item("Notebook", 40))),
                new Order(List.of(new Item("Marker", 20), new Item("Scale", 15))),
                new Order(List.of(new Item("Pencil", 5), new Item("Eraser", 5), new Item("Sharpener", 10)))
        ));

        System.out.println(orders.stream().max(Comparator.comparing(Order::getTotalPrice)));
    }
}
