package com.priyanshee.ExceptionHandling.question2;

public class InsufficientFundsException extends BankingException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
