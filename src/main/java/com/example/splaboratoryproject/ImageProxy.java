package com.example.splaboratoryproject;

public class ImageProxy implements Element {


    @Override
    public void print() {
       loadImage();
       this.realImage.print();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

}
