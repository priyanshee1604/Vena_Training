package com.priyanshee.dayone.question5;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Priyanshee", 2, 1000000);
        System.out.println(fte.getDetails());
        fte.calculateSalary();

        System.out.println("----------------------");

        FreeLancer freelancer = new FreeLancer("Lakshya", 1, 40, 600);
        System.out.println(freelancer.getDetails());
        freelancer.calculateSalary();
    }
}
