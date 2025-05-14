package com.priyanshee.Collections.question6;

import java.util.*;

//Problem 6: Library Catalog (Map<String, Set<Book>>)
//Each genre maps to a set of Book objects.
//• Prevent duplicate books using equals and hashCode.
//• Print all books in a genre, sorted by publication year.
public class Library {
    private final Map<String, Set<Book>> catalog = new HashMap<>();

    //computeIfAbsents if key is present returns value if absent inserts the value.
    public void addBook(String genre, Book book) {
        catalog.computeIfAbsent(genre, k -> new TreeSet<>(Comparator.comparing(Book::getPublicationYear).reversed())).add(book);
    }

    public void printBooksByGenre(String genre) {
        System.out.println("\nBooks in genre: " + genre);
        catalog.get(genre)
                .forEach(System.out::println);
    }

    public void printAllGenres() {
        for (String genre : catalog.keySet()) {
            printBooksByGenre(genre);
        }
    }
}
