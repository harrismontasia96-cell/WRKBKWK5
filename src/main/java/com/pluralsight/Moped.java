package com.pluralsight;

public class Moped extends Vehicle {
    private String color;
    public Moped(String color) {
        this.color = color;

    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String color1) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.color = color1;
    }
}

