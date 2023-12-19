package com.example.splaboratoryproject;

public interface Visitor<T> {

    T  visitBook(Book book);
    T visitSection(Section section);
    T visitTabelOfContents(TableOfContents tabelOfContents);
    T visitParagraph(Paragraph paragraph);
    T visitImageProxy(ImageProxy imageProxy);
    T visitImage(Image image);
    T visitTabel(Table table);
}
