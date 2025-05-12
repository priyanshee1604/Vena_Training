package com.priyanshee.ExceptionHandling.question6;

public class FileProcessor {
    public void validateFile(String fileName) throws FileValidationException {
        if (!fileName.endsWith(".txt")) {
           throw new FileValidationException("Only .txt files are allowed.");
        }
    }

    public void checkSystemHealth() {
        boolean isSystemCorrupted = true;
        if (isSystemCorrupted) {
            throw new CriticalSystemException("Systemed is corrupted, cannot continue.");
        }
    }
}
