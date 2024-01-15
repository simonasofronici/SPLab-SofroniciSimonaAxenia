package com.example.splaboratoryproject.services;

import com.example.splaboratoryproject.model.Content;
import com.example.splaboratoryproject.model.Paragraph;
import com.example.splaboratoryproject.dao.AlignStrategy;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph p, Content c) {
        System.out.println("Aligning to the center: " + p.getText());
    }
}

