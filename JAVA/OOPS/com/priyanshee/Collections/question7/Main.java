package com.priyanshee.Collections.question7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> movieRatings = new HashMap<>();
        movieRatings.put("movie1", List.of(3, 4, 2, 5, 1));
        movieRatings.put("movie2", List.of(3, 3, 5, 5, 1));
        movieRatings.put("movie3", List.of(1, 4, 2, 4, 1));
        movieRatings.put("movie4", List.of(1, 2, 2, 5, 1));
        movieRatings.put("movie5", List.of(3, 1, 1, 5, 1));
        movieRatings.put("movie6", List.of(2, 2, 2, 5, 1));
        movieRatings.put("movie7", List.of(5, 5, 5, 5, 5));
        movieRatings.put("movie8", List.of(1, 1, 1, 1, 1));

        Map<String, Double> avgRatings = new TreeMap<>();
        movieRatings.forEach((movie, ratings) -> {
            int sum = ratings.stream().reduce(0, Integer::sum);
            double avg = (double) sum / ratings.size();
            avgRatings.put(movie, avg);
        });
//
        avgRatings.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String, Double>::getValue).reversed()).forEach(System.out::println);
    }
}
