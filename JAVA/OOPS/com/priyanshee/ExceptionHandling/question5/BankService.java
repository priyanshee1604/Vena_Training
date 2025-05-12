package com.priyanshee.ExceptionHandling.question5;

public class BankService {
    public void transferFunds(BankAccount from, BankAccount to, double amount) {
        try {
            from.withdraw(amount); // Step 1: Deduct from sender
            if (to == null) {
                throw new Exception("Target account is invalid.");
            }
            to.deposit(amount);    // Step 2: Credit receiver
            System.out.println("Transfer successful: ₹" + amount);
        } catch (Exception e) {
            // Rollback by re-depositing to sender if failed after withdrawal
            System.err.println("Transfer failed: " + e.getMessage());
            from.deposit(amount); // Rollback
        }
    }
}

