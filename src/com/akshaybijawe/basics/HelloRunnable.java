package com.akshaybijawe.basics;

/**
 * @author arbijawe on 3/19/18
 * @project Threads-Tutorial
 */

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + " a thread created by " +
                "implementing a Runnable interface!");
    }
}
