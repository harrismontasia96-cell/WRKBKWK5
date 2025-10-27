package com.pluralsight;

public class SemiTruck extends Vehicle {
    private boolean canTransform = true;
    public boolean canTransform() {
        return canTransform;

    }
    public void setCanTransform(boolean canTransform) {
        this.canTransform = canTransform;
    }

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean canTransform) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.canTransform = canTransform;
    }
}
