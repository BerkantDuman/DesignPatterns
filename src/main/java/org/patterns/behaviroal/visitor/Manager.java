package org.patterns.behaviroal.visitor;

public class Manager implements Employee{
    private int price = 10000;

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
