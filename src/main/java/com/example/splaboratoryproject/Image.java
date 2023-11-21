package com.example.splaboratoryproject;


import java.util.concurrent.TimeUnit;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Image implements Element{
    private String url;

    public Image(String url) {
        this.url = url;
    }

    public void print() {
        System.out.println("Clase.Image: " + url);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    private List<Image> images;

    public Image() {
        this.images = new ArrayList<>();
    }

    public void add(Image image) {
        images.add(image);
    }

    public Image get(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        }
        return null;
    }

    public void remove(int index) {
        if (index >= 0 && index < images.size()) {
            images.remove(index);
        }
    }

    public void printAll() {
        for (Image image : images) {
            image.print();
        }
    }
}



