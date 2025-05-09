package com.priyanshee.FunctionalProgramming.Level5.question39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>(List.of(
                new Person("Alice", 15),
                new Person("Bob", 22),
                new Person("Charlie", 35),
                new Person("Daisy", 42),
                new Person("Edward", 18),
                new Person("Fiona", 60)
        ));

        peoples.stream().collect(Collectors.groupingBy(person -> {
            if (person.age < 20) return "<20";
            else if (person.age <= 40) return "20-40";
            else return "40+";
        })).forEach((s, people) -> System.out.println(s + " " + people));
    }
}
