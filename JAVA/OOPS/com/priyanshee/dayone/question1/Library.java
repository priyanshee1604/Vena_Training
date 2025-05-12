package com.priyanshee.dayone.question1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //List is an interface so we implemented it in
    // the constructor below using arraylist.
    //final means the reference to the List object cannot change.
    private final List<Book> books;

    public Library() {
        books =  new ArrayList<>();
    }

    public  void addBook(Book book) {
        //here we are using the Array List build in method add
        //to add book to the library
        books.add(book);
    }

    public void  searchByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found with title " + title);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Book with the title " + title + "do not exists.");
        }
    }
}
