package com.akshaybijawe.basics;

/**
 * @author arbijawe on 3/19/18
 * @project Threads-Tutorial
 */

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + " a thread created by " +
                "extending Thread class!");

    }
}
