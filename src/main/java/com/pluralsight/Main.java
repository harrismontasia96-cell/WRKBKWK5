package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped("Red",3,300,17,"Red");
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car Barbie  = new Car("pink",2,200,16,true );
        Barbie.setColor("Pink");
        Barbie.setFuelCapacity(10);

        SemiTruck  TransFormer = new SemiTruck("yellow");
        TransFormer.setColor("Optimis Prime");
        TransFormer.setFuelCapacity(100);

        HoverCraft LoveRide = new HoverCraft();
        LoveRide.setColor("Red");
        LoveRide.setFuelCapacity(8);




    }
}
