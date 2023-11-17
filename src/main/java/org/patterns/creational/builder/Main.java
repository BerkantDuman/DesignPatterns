package org.patterns.creational.builder;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bedroom room = new BedroomBuilder()
                .setColor(Color.BLACK)
                .setFloorNumber(1)
                .setNumberOfDoors(1)
                .setHeight(1)
                .createBedroom();


    }
}
