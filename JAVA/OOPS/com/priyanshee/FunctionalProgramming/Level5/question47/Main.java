package com.priyanshee.FunctionalProgramming.Level5.question47;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Comment> comments = List.of(
                new Comment("Alice", "Nice post!"),
                new Comment("Bob", "Great!"),
                new Comment("Alice", "Thanks!"),
                new Comment("Charlie", "Interesting."),
                new Comment("Bob", "Good point.")
        );

        comments.stream().collect(Collectors.groupingBy(Comment::getUsername, Collectors.counting())).forEach(
                (name, count) -> {
                    System.out.println(name + " " + count);
                }
        );
    }
}
