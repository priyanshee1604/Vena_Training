package com.priyanshee.ExceptionHandling.question8;

public class RetryMechanism {
    public String fetchDateWithRetry(FlakyService service, int maxAttempt) throws ServiceUnavailableException {
        int attempt = 0;
        while (attempt < maxAttempt) {
            try {
                return service.readDate();
            } catch (Exception e) {
                attempt++;
                System.out.println("Attempt " + attempt + " failed: " + e.getMessage());
                if (attempt == maxAttempt) {
                    throw new ServiceUnavailableException("Service failed did maximum number of attempts.");
                }
            }
        }

        //unreachable
        return "";
    }
}
