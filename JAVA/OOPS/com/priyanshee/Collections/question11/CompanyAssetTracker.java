package com.priyanshee.Collections.question11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompanyAssetTracker {
    private Map<String, Set<Asset>> departmentAssets = new HashMap<>();
    private Set<String> globalAssetIds = new HashSet<>();

    public boolean addAsset(String department, Asset asset) {
        if (globalAssetIds.contains(asset.getId())) {
            System.out.println("Duplicate asset ID detected: " + asset.getId());
            return false;
        }

        departmentAssets.putIfAbsent(department, new HashSet<>());
        departmentAssets.get(department).add(asset);
        globalAssetIds.add(asset.getId());
        System.out.println("Asset added to " + department + ": " + asset);
        return true;
    }

    public void printAssetsByDepartment() {
        departmentAssets.entrySet().stream().forEach(
                entry -> {
                    System.out.println("\nDepartment: " + entry.getKey());
                    System.out.println(entry.getValue());
                }
        );
    }
}
