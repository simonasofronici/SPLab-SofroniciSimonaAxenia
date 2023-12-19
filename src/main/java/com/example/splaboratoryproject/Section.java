package com.example.splaboratoryproject;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import com.example.splaboratoryproject.Element;

public class Section implements Element {

    @Getter
    @Setter
    private String title;
    private List<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : elements) {
            element.print();
        }
    }


    @Override
    public void addElement(Element element) {
        elements.add(element);
    }

    @Override
    public void removeElement(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int number) {
        if (number >= 0 && number < elements.size()) {
            return elements.get(number);
        }
        return null;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void add(Element element){
        elements.add(element);
    }
}
