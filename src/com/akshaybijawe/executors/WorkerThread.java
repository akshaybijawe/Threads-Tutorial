package com.akshaybijawe.executors;

/**
 * @author arbijawe on 3/21/18
 * @project Threads-Tutorial
 */

public class WorkerThread implements Runnable {

    private final String message;

    //Constructor to assign a message when creating a new thread
    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);

        //call workToBeDone method to simulate a delay
        workToBeDone();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void workToBeDone() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
