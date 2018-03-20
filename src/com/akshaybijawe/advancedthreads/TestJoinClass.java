package com.akshaybijawe.advancedthreads;

/**
 * @author arbijawe on 3/19/18
 * @project Threads-Tutorial
 */

public class TestJoinClass extends Thread {

    public TestJoinClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            try{
                //stop the thread for 1/2 second
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " i = " + i );

        }
    }
}
