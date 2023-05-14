package org.example;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        int countBooks = 10;
        int countShelves = 20;

        List<Shelf> shelves = new ArrayList<>(countShelves);

        List<Book> books = new ArrayList<>(createBook(countBooks).stream().sorted(Comparator.comparing(Book::getName)).toList());

        for (int i = 0; i < countShelves; i++) {
            double x = Math.floor(books.size() / (countShelves - shelves.size()));
            shelves.add(new Shelf(books.subList(0, (int) x)));
            books = new ArrayList<>(books.subList((int) x, books.size()));

        }

        printShelves(shelves);


    }

    private static List<Book> createBook(int count) {
        int i = 0;
        List<Book> books = new ArrayList<>();
        while (i < count) {
            books.add(new Book("Книга" + (i+1)));
            i++;
        }
        return books;
    }

    private static void printShelves(List<Shelf> shelves) {
        shelves.stream()
                .forEach(shelf -> {
                    System.out.println(shelf);
                });
    }
}