package com.example.splaboratoryproject;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Clase.Paragraph: " + text);
    }

    @Override
    public void addElement(Element element) {

    }

    @Override
    public void removeElement(Element element) {

    }

    private List<Paragraph> paragraphs;

    public Paragraph() {
        this.paragraphs = new ArrayList<>();
    }

    public void add(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public Paragraph get(int index) {
        if (index >= 0 && index < paragraphs.size()) {
            return paragraphs.get(index);
        }
        return null;
    }

    public void remove(int index) {
        if (index >= 0 && index < paragraphs.size()) {
            paragraphs.remove(index);
        }
    }

    public void printAll() {
        for (Paragraph paragraph : paragraphs) {
            paragraph.print();
        }
    }
}

