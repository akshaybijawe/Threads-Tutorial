package com.akshaybijawe.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author arbijawe on 3/21/18
 * @project Threads-Tutorial
 */

public class Threads {

    public static void main(String[] args) {

        //creating a pool of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            Runnable worker = new WorkerThread("I'm a thread " + i);

            //calling execute method of ExecutorService
            executor.execute(worker);
        }
        executor.shutdown();

        while(!executor.isTerminated()){

        }

        System.out.println("Finished all threads");
    }




}
