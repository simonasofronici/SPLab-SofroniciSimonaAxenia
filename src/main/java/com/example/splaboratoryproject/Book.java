package com.example.splaboratoryproject;

import java.util.ArrayList;
import java.util.List;

class Book extends Section{
    private String title;
    private List<Author> author;
    private TableOfContents tableOfContents;

    public Book(String title) {
        super("Front Cover");
        this.title = title;
        this.author = new ArrayList<>();
        this.tableOfContents = tableOfContents;
    }

    public void print() {
        System.out.println("Clase.Book Title: " + title);
        for (Author a : author) {
            a.print();
        }
    }

    public void addAuthor(Author autor) {
        author.add(autor);
    }

    public void addContent(Element cap1) {
        super.add(cap1);
    }
}


