package com.priyanshee.Collections.question11;

import java.util.Objects;

public class Asset {
    private final String id;
    private final String name;

    public Asset(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public String toString() {
        return "id='" + id + "', name='" + name;
    }

    //Q1. Why is it important to override equals and hashcode method here.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asset asset = (Asset) o;
        return Objects.equals(id, asset.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
