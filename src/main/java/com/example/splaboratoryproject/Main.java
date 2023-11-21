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
        long startTime = System.currentTimeMillis();
        Image img1 = new Image("Pamela Anderson");
        Image img2 = new Image("Kim Kardashian");
        Image img3 = new Image("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");

        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
    }
}
