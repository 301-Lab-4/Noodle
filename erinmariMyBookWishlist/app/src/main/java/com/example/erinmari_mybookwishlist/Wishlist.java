package com.example.erinmari_mybookwishlist;


import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    Integer length;
    List<Book> wishlist;

    public Wishlist() {
        this.wishlist = new ArrayList<>(25); //collection of books
        this.length = 0; //sets length to number of books in the wishlist
    }

    //Add new book to end of wishlist
    public void addBook(Book newBook){
        this.wishlist.add(newBook);
        //update size of wishlist
        this.length = wishlist.size();
    }

    //Remove book from wishlist
    public void delBook(Book book){
        this.wishlist.remove(book);
        //update size of wishlist
        this.length = wishlist.size();
        //this should maybe an exception if the book is not found
    }




}
