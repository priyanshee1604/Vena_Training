package com.priyanshee.Collections.question6;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Fiction", new Book("Book A", "Author X", 2010));
        library.addBook("Fiction", new Book("Book B", "Author Y", 2005));
        library.addBook("Fiction", new Book("Book A", "Author X", 2010)); // Duplicate
        library.addBook("Science", new Book("Physics 101", "Dr. Z", 2018));
        library.addBook("Science", new Book("Astronomy", "Dr. Star", 2015));

        library.printAllGenres();
    }
}
