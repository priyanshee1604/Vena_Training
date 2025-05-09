package com.priyanshee.FunctionalProgramming.Bonus;

import java.time.LocalDate;
import java.util.*;

public class question53 {

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2023, 5, 10),
                LocalDate.of(2022, 3, 15),
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2021, 12, 25)
        );

        Comparator<LocalDate> dateComparator = Comparator.naturalOrder();

        Optional<LocalDate> minDate = dates.stream().min(dateComparator);
        Optional<LocalDate> maxDate = dates.stream().max(dateComparator);

        System.out.println("Earliest date: " + minDate.orElse(null));
        System.out.println("Latest date: " + maxDate.orElse(null));
    }
}

