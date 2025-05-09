package com.priyanshee.FunctionalProgramming.Level5.question45;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookSummaryGenerator {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Java Basics", 499.99, 4.5),
                new Book("Advanced Java", 699.50, 4.8),
                new Book("Spring Boot", 599.00, 4.2)
        );

        Map<String, Object> summary = summarizeBooks(books);
        summary.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static Map<String, Object> summarizeBooks(List<Book> books) {
        int count = books.size();
        double totalPrice = books.stream().mapToDouble(Book::getPrice).sum();
        double avgRating = books.stream().mapToDouble(Book::getRating).average().orElse(0.0);

        Map<String, Object> summary = new HashMap<>();
        summary.put("totalCount", count);
        summary.put("averageRating", avgRating);
        summary.put("totalPrice", totalPrice);
        return summary;
    }
}
