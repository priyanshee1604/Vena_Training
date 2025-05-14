package com.priyanshee.Collections.question12;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class VotingSystem {
    private final Map<String, Integer> voteMap = new HashMap<>();

    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
    }

    public void printResults() {
        voteMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed()).forEach(System.out::println);
    }
}
