package org.patterns.behaviroal.visitor;

public class SalesMan implements Employee{
    private int price = 2000;

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
