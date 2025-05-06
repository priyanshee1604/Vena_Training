package com.priyanshee.Multithreading.ImageProcessor;

import java.util.concurrent.Callable;

public class ImageProcessor implements Callable<String> {
    private final int imageId;

    public ImageProcessor(int imageId) {
        this.imageId = imageId;
    }

    @Override
    // defined the exception to be thrown
    public String call() throws InterruptedException {
        //simulate the image processing time.
        Thread.sleep(100);
        //also checking the total number of threads in the pool should be 5.
        return  Thread.currentThread().getName()  +" Image " + imageId + " processed.";
    }
}
