package org.patterns.creational.builder;

import java.awt.*;

public class Bedroom {

    private int height;
    private int floorNumber;
    private Dimension dimension;
    private Color color;
    private int numberOfWindows;
    private int numberOfDoors;


    public Bedroom(int height, int floorNumber, Dimension dimension, Color color, int numberOfWindows, int numberOfDoors) {
        this.height = height;
        this.floorNumber = floorNumber;
        this.dimension = dimension;
        this.color = color;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }
}
