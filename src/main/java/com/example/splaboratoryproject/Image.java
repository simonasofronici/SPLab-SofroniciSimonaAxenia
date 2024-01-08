package com.example.splaboratoryproject;


import java.util.concurrent.TimeUnit;


public class Image implements Element, Visitee {
    private String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + getImageName());
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

        visitor.visitImage(this);
    }

    public String getName() {

        return imageName;
    }
}



