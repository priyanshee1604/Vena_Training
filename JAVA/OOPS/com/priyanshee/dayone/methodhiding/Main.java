package com.priyanshee.dayone.methodhiding;

    class Parent {
        static void display() {
            System.out.println("Display method of Parent class");
        }
    }

    class Child extends Parent {
        static void display() {
            System.out.println("Display method of Child class");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Parent obj1 = new Parent();
            Parent obj2 = new Child();
            //method hiding is shown because static methods are resolved at compile-time based on the reference type,
            // not the object type.

            obj1.display();  // Output: Display method of Parent class
            obj2.display();  // Output: Display method of Parent class (method hiding)

            Child obj3 = new Child();
            obj3.display();  // Output: Display method of Child class
        }
    }

