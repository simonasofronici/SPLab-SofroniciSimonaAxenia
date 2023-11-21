package com.example.splaboratoryproject;


import java.util.ArrayList;
import java.util.List;

public class Table {
    private String title;
    private List<String> elements;

    public Table(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public void print() {
        System.out.println("Clase.Table Title: " + title);
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public void add(String element) {
        elements.add(element);
    }

    public String get(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }

    public void remove(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        }
    }
}
