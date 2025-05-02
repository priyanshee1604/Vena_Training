package com.priyanshee.Collections.question11;

public class Main {
    public static void main(String[] args) {
        CompanyAssetTracker tracker = new CompanyAssetTracker();

        tracker.addAsset("IT", new Asset("A001", "Laptop"));
        tracker.addAsset("HR", new Asset("A002", "Projector"));
        tracker.addAsset("IT", new Asset("A003", "Printer"));

        tracker.addAsset("Finance", new Asset("A001", "Monitor"));

        tracker.printAssetsByDepartment();
    }
}

