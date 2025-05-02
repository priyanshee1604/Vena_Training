package com.priyanshee.Collections.question10;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BankLog logs = new BankLog();

        logs.addTransaction("ACC123", new Transaction(500, "deposit", LocalDateTime.now().minusDays(2)));
        logs.addTransaction("ACC123", new Transaction(200, "withdraw", LocalDateTime.now()));
        logs.addTransaction("ACC123", new Transaction(1000, "deposit", LocalDateTime.now().minusDays(1)));

        logs.printStatement("ACC123");
    }
}
