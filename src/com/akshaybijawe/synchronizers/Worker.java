package com.akshaybijawe.synchronizers;

import java.util.concurrent.CountDownLatch;

/**
 * @author arbijawe on 3/21/18
 * @project Threads-Tutorial
 */

public class Worker extends Thread {
    private final CountDownLatch start;
    private final CountDownLatch end;

    public Worker(CountDownLatch start, CountDownLatch end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try{
            printInfo("thread entered run()");
            //wait before proceeding
            start.await();
            printInfo("doing work");
            Thread.sleep(3000);
            //reduce count
            end.countDown();
        }catch(InterruptedException e){
            System.err.println(e);
        }
    }

    void printInfo(String s){
        System.out.println(System.currentTimeMillis() + ": " + Thread.currentThread() + ": " + s);
    }
}
