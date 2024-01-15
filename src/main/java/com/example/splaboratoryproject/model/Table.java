package com.example.splaboratoryproject.model;


import com.example.splaboratoryproject.dao.Element;
import com.example.splaboratoryproject.dao.Visitee;
import com.example.splaboratoryproject.dao.Visitor;
import lombok.Getter;

@Getter
public class Table implements Element, Visitee {
    private String tableTitle;

    public Table(String tableTitle) {
        this.tableTitle = tableTitle;
    }

    @Override
    public void print() {
        System.out.println(tableTitle);
    }

    @Override
    public void addElement(Element element) {

    }

    @Override
    public void removeElement(Element element) {

    }

    @Override
    public Element get(int number) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visitTabel(this);
    }

    public String getName() {

        return tableTitle;
    }
}