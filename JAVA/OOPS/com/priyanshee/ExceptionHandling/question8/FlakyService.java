package com.priyanshee.ExceptionHandling.question8;

import java.util.Random;

public class FlakyService {
        private Random random = new Random();
    public String readDate() throws Exception {
        //stimulating a flaky service which sometimes return data and sometimes fail.
        if (random.nextBoolean()) {
            throw new Exception("Service Failed");
        }
        return "Data from service";
    }
}
