package org.patterns.behaviroal.visitor;

public interface Employee {

    int getPrice();

    void accept(Visitor visitor);
}
