package com.priyanshee.dayone.question1;

//made the class public thus it can be used inside this package anywhere, similarly for the methods
public class Book {
    private  String title;
    private String author;
    private int ISBN;

   public Book(String title, String author, int ISBN) {
       this.title = title;
       this.author = author;
       this.ISBN = ISBN;
   }

   public void printDetails() {
        // could have used this.title but title and this.title are the same in an instance method.
       System.out.println("title: " + title);
       System.out.println("author: " + author);
       System.out.println("ISBN: " + ISBN);
   }

   //creating a new method getTitle because we need it when i need
    //to search in library by its title.
    public String getTitle() {
       return title;
    }
}