package com.example.splaboratoryproject;

public interface Visitor<T> {

    T  visitBook(Book book);
    T visitSection(Section section);
    T visitTableOfContents(TableOfContents tableOfContents);
    T visitParagraph(Paragraph paragraph);
    T visitImageProxy(ImageProxy imageProxy);
    T visitImage(Image image);
    T visitTabel(Table table);
}
