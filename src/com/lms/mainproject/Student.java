package com.lms.mainproject;

public class Student {
    final String id;
    String username;
    String email;
    String phone;

    Student( String id, String username, String email, String phone ) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public void update( String username, String email, String phone ) {
        this.username = username;
        this.email = email;
        this.phone = phone;
    }
}
