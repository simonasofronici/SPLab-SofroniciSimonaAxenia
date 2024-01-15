package com.example.splaboratoryproject.model;

import java.util.ArrayList;
import java.util.List;

import com.example.splaboratoryproject.dao.Visitee;
import com.example.splaboratoryproject.dao.Visitor;
import lombok.Getter;
import lombok.Setter;
import com.example.splaboratoryproject.dao.Element;

public class Section implements Element, Visitee {

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

    @Override
    public void accept(Visitor visitor) {

        visitor.visitSection(this);
        for(Element e : elements){
            e.accept(visitor);
        }
    }
}
