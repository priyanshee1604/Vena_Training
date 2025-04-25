package com.priyanshee.dayone.question5;

public class FreeLancer extends Employee {
    long hours;
    long payperhour;

    public FreeLancer(String name, int id, long hours, long payperhour) {
        super(name, id, "Freelancer", hours * payperhour);
        this.hours = hours;
        this.payperhour = payperhour;
    }

    public void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Billed: " + salary);
    }

    public void calculateSalary() {
        System.out.println("Hourly income: " +  payperhour);
        System.out.println("Hours worked: " +  hours);
        System.out.println("Total Billed: " + payperhour * hours);
    }
}
