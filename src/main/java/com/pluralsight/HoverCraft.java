package com.pluralsight;

public class HoverCraft extends Vehicle {
    private String Red;
    public HoverCraft(String color) {
        this.Red = color;
    }
    public String getIsBlue() {
        return Red;
    }
    public void setIsBlue(String IsBlue) {
        this.Red = IsBlue;
    }

    public HoverCraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String isBlue) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        Red = isBlue;
    }
}
