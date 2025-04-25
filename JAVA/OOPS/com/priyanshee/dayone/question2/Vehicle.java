package com.priyanshee.dayone.question2;

public class Vehicle {
    // defined them protected because in case of private it won't be
    // accessible in the subclass directly.
    protected double speed;
    protected double fuelCapacity;

    //constructor to assign values.
    public Vehicle(double speed, double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        this.speed = speed;
    }

    // s = d/t
    // m = d/f
    protected void getMileage() {
        System.out.println("The mileage of the vehicle is " + (speed * 10) / fuelCapacity);
    }
}
