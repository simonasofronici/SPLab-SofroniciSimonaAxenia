package com.example.splaboratoryproject;
public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph p, Content c) {
        System.out.println("Aligning to the center: " + p.getText());
    }
}

