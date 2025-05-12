package com.priyanshee.ExceptionHandling.question7;

public class ResourceOne implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("Exception from resource one.");
    }
}
