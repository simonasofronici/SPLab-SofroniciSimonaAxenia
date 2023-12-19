package com.example.splaboratoryproject;


public class Main {
    /*public static void main(String[] args) {
        // Exemplu de utilizare a claselor
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Front Cover");
        Section cap11 = new Section("Front Cover");
        Section cap111 = new Section("Front Cover");
        Section cap1111 = new Section("Front Cover");
        noapteBuna.addContent( new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent( cap1);
        cap1.add( new Paragraph("Moto capitol"));
        cap1.add( cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add( cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add( cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        noapteBuna.print();


    }*/
    public static void main(String[] args) throws Exception {
            Section cap1 = new Section("Capitolul 1");
            Paragraph p1 = new Paragraph("Paragraph 1");
            cap1.add(p1);
            Paragraph p2 = new Paragraph("Paragraph 2");
            cap1.add(p2);
            Paragraph p3 = new Paragraph("Paragraph 3");
            cap1.add(p3);
            Paragraph p4 = new Paragraph("Paragraph 4");
            cap1.add(p4);
            System.out.println("Printing without Alignment");
            System.out.println();
            cap1.print();
            p1.setAlignStrategy(new AlignCenter());
            p2.setAlignStrategy(new AlignRight());
            p3.setAlignStrategy(new AlignLeft());

            System.out.println();
            System.out.println("Printing with Alignment");
            System.out.println();
            cap1.print();
        }
    }
