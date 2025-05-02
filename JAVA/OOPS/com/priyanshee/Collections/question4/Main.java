package com.priyanshee.Collections.question4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //deadline > priority
        // order by closest deadline, then highest priority.
        //higher the number higher is the priority, smaller the number closest is the deadline
        Comparator<Task> deadlineNpriority = Comparator.comparing(Task::getDeadline).thenComparing(Comparator.comparing(Task::getPriority).reversed());
        Queue<Task> todos = new PriorityQueue<>(deadlineNpriority);

        todos.add(new Task("Task1", 1,9));
        todos.add(new Task("Task2", 2,8));
        todos.add(new Task("Task3", 3,7));
        todos.add(new Task("Task4", 4,6));
        todos.add(new Task("Task5", 5,5));
        todos.add(new Task("Task6", 6,4));
        todos.add(new Task("Task7", 7,3));
        todos.add(new Task("Task8", 8,2));
        todos.add(new Task("Task9", 9,1));

        for(Task t : todos){
            System.out.println(t);
        }

        System.out.println("--------------");

        while (!todos.isEmpty()) {
            System.out.println(todos.poll());
        }

    }
}
