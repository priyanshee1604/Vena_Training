package com.priyanshee.FunctionalProgramming.Level5.question31;

import com.priyanshee.FunctionalProgramming.Level5.question30.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> logs = new ArrayList<>(List.of(
                new Transaction(100.0, "DEBIT"),
                new Transaction(200.0, "CREDIT"),
                new Transaction(150.0, "DEBIT"),
                new Transaction(50.0, "DEBIT"),
                new Transaction(300.0, "CREDIT")
        ));

        System.out.println(logs.stream().filter(log -> log.getType().equals("DEBIT")).mapToDouble(Transaction::getAmount).sum());
    }
}
