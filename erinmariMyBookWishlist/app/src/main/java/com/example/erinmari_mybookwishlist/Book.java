package com.example.erinmari_mybookwishlist;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String author;
    List<String> genre;
    Integer pubYear;
    Boolean status; //True = Read, False = Unread

    //Constructor declaration of class
    public Book(String title, String author, String genre, Integer pubYear, Boolean status){
        this.title = title;
        this.author = author;
        this.genre = new ArrayList<>();
        this.pubYear = pubYear;
        this.status = status;
    }

    //Getters and Setters for all class attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        genre.add(newGenre);
    }

    public Integer getPubYear() {
        return pubYear;
    }

    public void setPubYear(Integer pubYear) {
        this.pubYear = pubYear;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
