package com.priyanshee.Collections.question11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompanyAssetTracker {
    private final Map<String, Set<Asset>> departmentAssets = new HashMap<>();
    private final Set<String> globalAssetIds = new HashSet<>();

    public void addAsset(String department, Asset asset) {
        if (globalAssetIds.contains(asset.getId())) {
            System.out.println("Duplicate asset ID detected: " + asset.getId());
            return;
        }

        departmentAssets.putIfAbsent(department, new HashSet<>());
        departmentAssets.get(department).add(asset);
        globalAssetIds.add(asset.getId());
        System.out.println("Asset added to " + department + ": " + asset);
    }

    public void printAssetsByDepartment() {
        departmentAssets.forEach((key, value) -> {
            System.out.println("\nDepartment: " + key);
            value.forEach(System.out::println);
        });
    }
}
