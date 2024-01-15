package com.example.splaboratoryproject.model;

class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Clase.Author: " + name);
    }

    public String getName() {
        return name;
    }
}



