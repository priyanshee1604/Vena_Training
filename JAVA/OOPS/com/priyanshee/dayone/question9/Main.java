package com.priyanshee.dayone.question9;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makesSound();

        System.out.println("----Cats sound---");
        Cat cat = new Cat();
        cat.makesSound();

        System.out.println("----Dogs sound---");
        Dog dog = new Dog();
        dog.makesSound();
    }
}
