package com.priyanshee.Collections.question10;

import java.util.*;

public class BankLog {
    private Map<String, List<Transaction>> transactionLog = new HashMap<>();

    public void addTransaction(String accountNo, Transaction tx) {
        transactionLog.computeIfAbsent(accountNo, k -> new ArrayList<>()).add(tx);
    }

    public void printStatement(String accountNo) {
        List<Transaction> transactions = transactionLog.get(accountNo);

        if(transactions == null || transactions.isEmpty()) {
            System.out.println("No transactions for account: " + accountNo);
            return;
        }

        transactions.stream().sorted(Comparator.comparing(Transaction::getTimestamp)).forEach(System.out::println);
    }
}
