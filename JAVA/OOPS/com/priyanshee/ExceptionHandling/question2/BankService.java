package com.priyanshee.ExceptionHandling.question2;

public class BankService {
    private String accountName;
    private double balance;

    public BankService(String accName, Double money) {
        this.accountName = accName;
        this.balance = money;
    }

    public String getName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transferFunds(BankService fromAcc, BankService toAcc, double amount) throws BankingException {
        if (fromAcc == null) {
            throw new InvalidAccountException("From Account does not exists.");
        }

        if (toAcc == null) {
            throw new InvalidAccountException("To Account does not exists.");
        }

        if (fromAcc.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient funds in account: " + fromAcc);
        }

        //if all the checks are passed then subtracting the transfered balance from Fromacc
        fromAcc.setBalance(fromAcc.getBalance() + amount);

        //and adding to toAcc
        toAcc.setBalance(toAcc.getBalance() - amount);

        System.out.println("Transfer successful: ₹" + amount + " from " + fromAcc + " to " + toAcc);
    }

}
