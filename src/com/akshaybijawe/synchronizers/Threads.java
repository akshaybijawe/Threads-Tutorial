package com.akshaybijawe.synchronizers;

import java.util.concurrent.CountDownLatch;

/**
 * @author arbijawe on 3/21/18
 * @project Threads-Tutorial
 */
/*
Example of CountDownLatch
 */
public class Threads {

    public static void main(String[] args) {
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(4);

        //create and start threads
        for(int i = 0; i < 5; ++i)
            new Thread(new Worker(start,end)).start();

            try{
                System.out.println("main thread doing something");
                Thread.sleep(1000);
                //let all threads proceed
                start.countDown();
                System.out.println("main thread doing something else");
                //wait for all threads to finish
                end.await();
            } catch (InterruptedException e){
                System.err.println(e);
            }

    }

}
