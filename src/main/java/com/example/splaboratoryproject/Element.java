package com.example.splaboratoryproject;

public interface Element extends Visitee{

    public void print();
    public void addElement(Element element);
    public void removeElement(Element element);
    public Element get(int number);

}