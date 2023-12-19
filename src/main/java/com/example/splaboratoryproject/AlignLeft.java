package com.example.splaboratoryproject;

public class AlignLeft implements AlignStrategy {

    @Override
    public void render(Paragraph p, Content c) {
        System.out.println("Aligning to the left: " + p.getText());
    }
}
