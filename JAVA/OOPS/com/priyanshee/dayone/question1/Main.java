package com.priyanshee.dayone.question1;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();


        Book B1 = new Book("Title1", "author1", 123456);
        Book B2 = new Book("Title2", "author2", 123457);
        Book B3 = new Book("Title3", "author3", 123458);

        System.out.println("Printing all the information about the books.");
        B1.printDetails();
        B2.printDetails();
        B3.printDetails();

        myLibrary.addBook(B1);
        myLibrary.addBook(B2);
        myLibrary.addBook(B3);

        System.out.println("Searching the books by title.");
        myLibrary.searchByTitle("Title1");
        myLibrary.searchByTitle("title2");
        myLibrary.searchByTitle("Title5");
    }
}
