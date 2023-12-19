package com.example.splaboratoryproject;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph p, Content c) {
        System.out.println("Aligning to the right: " + p.getText());
    }

}
