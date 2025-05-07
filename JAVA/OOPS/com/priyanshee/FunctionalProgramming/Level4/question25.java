package com.priyanshee.FunctionalProgramming.Level4;

//25.	Given a list of people (name, age), filter adults (age > 18) and collect names.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class question25 {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        // Sample data
        List<Person> people = new ArrayList<>(List.of(
                new Person("Alice", 22),
                new Person("Bob", 17),
                new Person("Charlie", 25),
                new Person("Daisy", 15),
                new Person("Edward", 30))
        );

        people.stream().filter(person-> person.getAge() > 18).map(Person::getName).toList().forEach(System.out::println);
    }
}
