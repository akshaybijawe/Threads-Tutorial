package com.akshaybijawe.advancedthreads;

/**
 * @author arbijawe on 3/19/18
 * @project Threads-Tutorial
 */

public class ThreadJoinExample {

    public static void main(String[] args) {
        TestJoinClass t1 = new TestJoinClass("t1");
        TestJoinClass t2 = new TestJoinClass("t2");
        TestJoinClass t3 = new TestJoinClass("t3");
        t1.start();
        t2.start();
        try {
            t2.join();
        }catch (Exception e ){
            System.out.println(e);
        }
        //Thread 3 won't start until thread 2 is complete
        t3.start();
    }
}
