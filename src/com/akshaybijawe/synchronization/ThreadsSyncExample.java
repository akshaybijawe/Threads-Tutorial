package com.akshaybijawe.synchronization;

/**
 * @author arbijawe on 3/20/18
 * @project Threads-Tutorial
 */

public class ThreadsSyncExample {

    //define a class variable called counter
    static int counter = 1;

    public static void main(String[] args) {

        //use lambda notation for the runnable method
        /*Runnable r = () ->
        {
            System.out.println("ID value: " + getID());
        };

        Thread one = new Thread(r,"one");
        one.start();

        Thread two = new Thread(r, "two");
        two.start();
        */

        //Example of locking using an object
        Runnable r2 = () ->
        {
            ID id = new ID();
            System.out.println("ID value: " + id.getID());
        };

        Thread one = new Thread(r2, "one");
        one.start();

        Thread two = new Thread(r2,"two");
        two.start();

    }

    public static synchronized int getID(){
        return counter++;
    }
}
