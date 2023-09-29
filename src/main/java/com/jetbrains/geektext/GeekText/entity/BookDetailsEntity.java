package com.jetbrains.geektext.GeekText.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BookInfo")
public class BookDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "isbn")
    private long isbn;
    @Column(name = "book_name")
    private String book_name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @Column(name = "author")
    private String author;
    @Column(name = "genre")
    private String genre;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "year_published")
    private int year_published;
    @Column(name = "copies_sold")
    private long copies_sold;

    public BookDetailsEntity(){
    }

    public BookDetailsEntity(long isbn, String book_name, String description, double price, String author, String genre, String publisher, int year_published, long copies_sold) {
        this.isbn = isbn;
        this.book_name = book_name;
        this.description = description;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year_published = year_published;
        this.copies_sold = copies_sold;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear_published() {
        return year_published;
    }

    public void setYear_published(int year_published) {
        this.year_published = year_published;
    }

    public long getCopies_sold() {
        return copies_sold;
    }

    public void setCopies_sold(long copies_sold) {
        this.copies_sold = copies_sold;
    }
}
