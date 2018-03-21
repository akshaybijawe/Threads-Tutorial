package com.akshaybijawe.synchronization.synchronizedblock;

/**
 * @author arbijawe on 3/20/18
 * @project Threads-Tutorial
 */

public class CountdownMain {

    public static void main(String[] args) {

        Countdown CD = new Countdown();

        Runnable r = () -> {

            synchronized (CD){
                CD.printCount();
            }

        };

        Thread one = new Thread(r, "one");
        Thread two = new Thread(r, "two");
        one.start();
        two.start();
    }
}
