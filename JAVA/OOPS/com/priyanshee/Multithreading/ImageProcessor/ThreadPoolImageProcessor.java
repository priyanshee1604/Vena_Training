package com.priyanshee.Multithreading.ImageProcessor;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolImageProcessor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Callable<String>> taskList = new ArrayList<>();
        for(int i = 1; i <= 50; i++) {
            taskList.add(new ImageProcessor(i));
        }

        //takes collection of runnable task and run them in parallel, and returns
        //the list of future value containing the result or the error.
        //blocks until all the task finish. thus we are able to get the total execution time.
        //if want to do in no blocking manner than use submit inside the loop as does not takes collection.
        //but at last the future.get will still block the execution until received with the result.
        //thus in both the ways we will get the total execution time.

        List<Future<String>> futures = executorService.invokeAll(taskList);

        for (Future<String> future: futures) {
            System.out.println(future.get());
        }

        executorService.shutdown();

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
