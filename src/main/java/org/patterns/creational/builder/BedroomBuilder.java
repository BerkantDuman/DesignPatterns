package org.patterns.creational.builder;

import java.awt.*;

public class BedroomBuilder {
    private int height;
    private int floorNumber;
    private Dimension dimension;
    private Color color;
    private int numberOfWindows;
    private int numberOfDoors;

    public BedroomBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public BedroomBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public BedroomBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Bedroom createBedroom() {
        return new Bedroom(height, floorNumber, dimension, color, numberOfWindows, numberOfDoors);
    }
}