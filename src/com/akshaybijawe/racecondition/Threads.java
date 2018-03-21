package com.akshaybijawe.racecondition;

/**
 * @author arbijawe on 3/20/18
 * @project Threads-Tutorial
 */

public class Threads {

    static double a = 10;
    static double b;

    public static void main(String[] args) {
        Runnable r1 = () ->
        {
            if (a == 10)
                try {
                    Thread.sleep(500);
                    b = a / 2.0;
                    System.out.println(Thread.currentThread().getName() + ": " + b);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

        };

        Runnable r2 = () -> {
            a = 12;
        };

        Thread thdA = new Thread(r1, "Thread A");
        Thread thdB = new Thread(r2, "Thread B");
        thdA.start();
        thdB.start();
    }

}
