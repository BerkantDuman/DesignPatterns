package org.patterns.behaviroal.memento;

public class TextDocument {

    private String text = "";
    private Memento memento = new Memento(text);

    public String write(String newText) {
        this.text += newText;
        return text;
    }


    public void print() {
        System.out.println(text);
    }

    public void save(){
        memento.setState(text);
    }

    public void undo(){
        text = memento.getState();
    }
}
