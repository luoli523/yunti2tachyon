package com.luoli523.book;

public class BookRunner {
    public static void main(String[] args) {
        BookStorage storage = new BookStorage();
        storage.getBooks().stream().forEach((Book b) -> System.out.println(b));
    }
}

