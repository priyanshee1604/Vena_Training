package com.priyanshee.ExceptionHandling.question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataProcessor {
    public void readDate() throws IOException {
        FileReader fr = new FileReader("nonexsitingfile.txt");
        BufferedReader br = new BufferedReader(fr);
        br.readLine();
        br.close();
    }

    public void processDate() throws DataProcessingException {
        try {
            readDate();
        } catch (IOException e) {
            throw new DataProcessingException("Error while processing date.", e);
        }
    }
}
