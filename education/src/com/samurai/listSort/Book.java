package com.samurai.listSort;

public class Book {
    private static int counter = 1;

    private int id;
    private String title;
    private String author;

    Book(String title, String author) {
        this.id = counter++;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book { " +
                "\n\ttitle: " + title + " , " +
                "\n\tauthor: " + author + " " +
                "\n}";

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
