package com.priyanshee.ExceptionHandling.question2;

public class InvalidAccountException extends BankingException {
    public InvalidAccountException(String message) {
        super(message);
    }
}
