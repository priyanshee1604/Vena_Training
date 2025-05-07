package com.priyanshee.Collections.question4;

//Create a Task class with name, priority, deadline.
//1. Use PriorityQueue to order by closest deadline, then highest priority.
//2. Poll and print tasks as they should be executed.
public class Task {
    private String name;
    private int priority;
    private int deadline;

    public Task(String name, int priority, int deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
    }
    public String getName() {
        return name;
    }

    public int getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return name + " deadline: " + deadline + " priority: " + priority;
    }
}
