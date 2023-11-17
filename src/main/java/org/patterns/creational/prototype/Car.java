package org.patterns.creational.prototype;

import java.awt.*;

public class Car implements Cloneable{

    private int age;
    private Color color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Car clone(){
        try {
            return (Car)super.clone();
        }catch (Exception e){
            throw new AssertionError();
        }
    }
}
