package com.priyanshee.dayone.question2;

public class Truck extends Vehicle {
    public Truck() {
        super(0, 0);
        System.out.println("This is a Truck");
        this.speed = 60;
        this.fuelCapacity = 300;
    }

    public void getMileage() {
        System.out.println("The mileage of a truck is " + (speed * 3) / fuelCapacity);
    }
}
