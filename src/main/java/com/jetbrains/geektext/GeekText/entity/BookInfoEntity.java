package com.jetbrains.geektext.GeekText.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "BookInfo")
public class BookInfoEntity {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY) UGH this line was the only thing messing me up with isbns
    @Column(name = "isbn")
    private Long isbn;
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
    private Long copies_sold;

    public BookInfoEntity(){
    }

    public BookInfoEntity(Long isbn, String book_name, String description, double price, String author, String genre, String publisher, int year_published, Long copies_sold) {
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

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
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

    public Long getCopies_sold() {
        return copies_sold;
    }

    public void setCopies_sold(Long copies_sold) {
        this.copies_sold = copies_sold;
    }
}
