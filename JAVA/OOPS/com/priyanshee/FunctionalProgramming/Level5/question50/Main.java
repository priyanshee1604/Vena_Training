package com.priyanshee.FunctionalProgramming.Level5.question50;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(100.0, LocalDate.of(2024, 1, 5)),
                new Order(200.0, LocalDate.of(2024, 3, 15)),
                new Order(150.0, LocalDate.of(2024, 5, 20)),
                new Order(300.0, LocalDate.of(2024, 7, 1))
        );

        // Date range filter
        LocalDate startDate = LocalDate.of(2024, 3, 1);
        LocalDate endDate = LocalDate.of(2024, 6, 1);
        Predicate<Order> datefilter = order -> order.getDate().isAfter(startDate) && order.getDate().isBefore(endDate);

        orders.stream().filter(datefilter).forEach(order -> {
            System.out.println(order);
        });

        System.out.println("Total earned between "+ startDate + " " + "and " + endDate+ " is " + orders.stream().filter(datefilter).mapToDouble(Order::getAmount).sum());

    }
}
