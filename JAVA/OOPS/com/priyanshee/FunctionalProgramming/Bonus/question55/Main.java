package com.priyanshee.FunctionalProgramming.Bonus.question55;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Job> jobs = List.of(
                new Job("DataSync", "FAILED"),
                new Job("ETL", "SUCCESS"),
                new Job("EmailSender", "FAILED"),
                new Job("Cleanup", "FAILED"),
                new Job("Analytics", "SUCCESS")
        );

    jobs.stream().filter(job -> job.getStatus().equalsIgnoreCase("FAILED")).map(job -> job.getName().toUpperCase()).sorted().forEach(System.out::println);
    }
}

