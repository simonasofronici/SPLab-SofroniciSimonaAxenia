package com.example.splaboratoryproject.model;

import com.example.splaboratoryproject.dao.Element;
import com.example.splaboratoryproject.dao.Visitor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class BookSaveVisitor implements Visitor {
    private ObjectNode jsonNode;

    public BookSaveVisitor() {
        jsonNode = new ObjectMapper().createObjectNode();
    }

    public void saveToJsonFile(String fileName) {
        try {
            new ObjectMapper().writeValue(new File(fileName), jsonNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Void visitBook(Book book) {
        jsonNode.put("type", "Book");
        jsonNode.put("data", book.getTitle());
        return null;
    }

    @Override
    public Void visitSection(Section section) {
        ObjectNode sectionNode = jsonNode.putObject("section");
        sectionNode.put("type", "Section");
        sectionNode.put("data", section.getTitle());

        for (Element element : section.getElements()) {
            element.accept(this);
        }

        return null;
    }

    @Override
    public Object visitTableOfContents(TableOfContents tabelOfContents) {
        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        ObjectNode paragraphNode = jsonNode.putObject("paragraph");
        paragraphNode.put("type", "Paragraph");
        paragraphNode.put("data", paragraph.getText());

        return null;
    }

    @Override
    public Object visitImageProxy(ImageProxy imageProxy) {
        return null;
    }

    @Override
    public Object visitImage(Image image) {
        return null;
    }

    @Override
    public Void visitTabel(Table table) {
        ObjectNode tableNode = jsonNode.putObject("table");
        tableNode.put("type", "Table");

        return null;
    }

}
