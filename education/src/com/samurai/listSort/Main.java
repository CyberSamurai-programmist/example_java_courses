package com.samurai.listSort;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> list = new LinkedList<>(Arrays.asList(new Book("Java", "Shiltd"), new Book("C#", "Gesse")));

        System.out.println("before: " + list);

        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });

        System.out.println("after: " + list);
    }
}
