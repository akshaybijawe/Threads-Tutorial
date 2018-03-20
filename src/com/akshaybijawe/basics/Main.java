package com.akshaybijawe.basics;

public class Main {

    public static void main(String[] args) {

        //Create a new Thread using a class that implements Runnable
        (new Thread(new HelloRunnable())).start();

        //Create a thread using a class that extends Thread
        (new HelloThread()).start();

        //Create a Runnable object
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                //Perform some work inside the thread
                System.out.println("Hello from " + Thread.currentThread().getName() + " NOT USING LAMBDA");
            }
        };

        //Create a Runnable object using lambda notation
        Runnable r2 = () -> System.out.println("Hello from " + Thread.currentThread().getName() + " USING LAMBDA notation");

        /* Create and start a thread using the first Runnable object
        *   This thread is also given a name in the arguments */
        Thread t1 = new Thread(r1, "Thread t1");
        t1.start();

        /* Create and start a second thread using the Runnable object with lambda notation and not given */
        Thread t2 = new Thread(r2);
        t2.start();




    }
}
