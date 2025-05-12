package com.priyanshee.dayone.question2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(10, 50);
        vehicle.getMileage();

        Vehicle car = new Car();
        System.out.println("Mileage of the car is " + car.getMileage());

        Vehicle truck = new Truck();
        System.out.println("Mileage of the truck is " + truck.getMileage());
    }
}
