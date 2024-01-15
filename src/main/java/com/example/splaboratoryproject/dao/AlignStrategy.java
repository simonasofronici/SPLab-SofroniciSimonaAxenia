package com.example.splaboratoryproject.dao;

import com.example.splaboratoryproject.model.Content;
import com.example.splaboratoryproject.model.Paragraph;

public interface AlignStrategy {

    public void render(Paragraph p, Content c);
}