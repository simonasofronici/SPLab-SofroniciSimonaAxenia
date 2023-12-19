package com.example.splaboratoryproject;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element , Visitee{
    private String text;
    private AlignStrategy alignStrategy; // New field for alignment strategy

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this, null); // Pass null for Context since it's not used in the example
        } else {
            System.out.println("Paragraph: " + getText());
        }
    }

    @Override
    public void addElement(Element element) {
        // You may implement this method if needed
    }

    @Override
    public void removeElement(Element element) {
        // You may implement this method if needed
    }

    @Override
    public Element get(int number) {
        // You may implement this method if needed
        return null;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}

