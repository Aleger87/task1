package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    private String name;

    private Book book;

    List<Book> books = new ArrayList<>();

    public Shelf(String name, Book book) {
        this.name = name;
        this.book = book;
        this.books.add(book);
    }

    public Shelf() {

    }

    public Shelf(List<Book> books) {
        this.books = books;
    }

    public Shelf(Book book) {
        this.book = book;
        this.books.add(book);
    }

    public Shelf(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Полка{" +
                "name='" + name + '\'' +
                ", book=" + book +
                ", books=" + books +
                '}';
    }
}
