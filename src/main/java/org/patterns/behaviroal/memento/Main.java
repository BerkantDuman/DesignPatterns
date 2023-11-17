package org.patterns.behaviroal.memento;

public class Main {

    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        textDocument.write("Hello");
        textDocument.print();
        textDocument.write("World");
        textDocument.print();
        textDocument.print();


        System.out.println("----------------------");
        TextDocument textDocument2 = new TextDocument();
        textDocument2.write("Hello");
        textDocument2.save();
        textDocument2.print();
        textDocument2.write("World");
        textDocument2.print();
        textDocument2.undo();
        textDocument2.print();
    }
}
