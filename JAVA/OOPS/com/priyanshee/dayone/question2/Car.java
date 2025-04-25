package com.priyanshee.dayone.question2;

public class Car extends  Vehicle {
    // so the child class constructor automatically tries to
    // call parent class non-arg constructor but in case when parent
    // class do not have a no-rg constructor, then we need to call the defined
    // parent class constructor, like parameterised constructor.

    public Car() {
        super(0, 0);
        System.out.println("This is a Car.");
        //overriding the inherited values
        this.speed = 30;
        this.fuelCapacity = 100;

    }

    //the child class return type should be subtype of
    // the parent class method return type.

    //the access modifier could be bigger than the original
    // method cannot decrease the access, always increase it.
    // thus either protected or public
    protected void getMileage() {
        System.out.println("The mileage of a car is " + (speed * 5) / fuelCapacity);
    }
}
