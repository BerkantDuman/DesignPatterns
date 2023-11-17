package org.patterns.creational.prototype;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setAge(2);
        car.setColor(Color.BLUE);
        Car car2 = car.clone();

        System.out.println(car.getAge() + " : " + car.getColor());
        System.out.println(car2.getAge() + " : " + car2.getColor());

    }
}
