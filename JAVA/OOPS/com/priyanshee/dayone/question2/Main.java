package com.priyanshee.dayone.question2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(10, 50);
        vehicle.getMileage();

        Car car = new Car();
        car.getMileage();

        Truck truck = new Truck();
        truck.getMileage();
    }
}
