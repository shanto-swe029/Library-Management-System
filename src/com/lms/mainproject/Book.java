package com.lms.mainproject;

public class Book {
    final String id;
    String name;
    String author;
    String edition;

    Book( String id, String name, String author, String edition ) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.edition = edition;
    }
}
