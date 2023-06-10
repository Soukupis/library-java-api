package com.example.Library.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    public Long id;

    public String title;

    public String description;

    public String isbn;

    public int amount;

    public String language;

    public int price;

    public Date releaseDate;

    public String author;

    public int pages;

    public String publisher;

    public Book(){}

    public Book(String title, String description, String isbn, int amount,
                String language, int price, Date releaseDate, String author,
                int pages, String publisher){
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.amount = amount;
        this.language = language;
        this.price = price;
        this.releaseDate = releaseDate;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAmount() {
        return amount;
    }

    public String getLanguage() {
        return language;
    }

    public int getPrice() {
        return price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }


}
