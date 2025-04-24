package com.priyanshee.dayone.question1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //TODO: here i am defining a list of type Book so as the Book class was public so we can use it here? cross check
    //List is an interface so we implemented it in the constructor
    //below using arraylist
    private List<Book> books;

    public Library() {
        books =  new ArrayList<>();
    }

    public  void addBook(Book book) {
        //here we are using the Array List build in method add
        // to add book to the library
        books.add(book);
    }

    public void  searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++){
            //here the books is of type arrayList thus we need to get it by get cannot do by
            //square bracket syntax like in normal array.
            if(books.get(i).getTitle().equalsIgnoreCase(title)){
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
