package com.priyanshee.ExceptionHandling.question7;

public class ResourceTwo implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Exception from ResourceTwo.");
    }
}
