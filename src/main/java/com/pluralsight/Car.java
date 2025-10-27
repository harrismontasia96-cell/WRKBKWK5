package com.pluralsight;

public class Car extends Vehicle {
    private boolean canFly = false;
    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;


    }

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean canFly) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.canFly = canFly;
    }
}
