package com.akshaybijawe.synchronization.synchronizedblock;

/**
 * @author arbijawe on 3/20/18
 * @project Threads-Tutorial
 */

public class Countdown {

    public void printCount(){
        try{
            for(int i = 10; i > 0; i--){
                System.out.println("  ---  " + i);
            }
            System.out.println("BlastOff!!");
        }catch(Exception e){
            System.out.println("Thread interrupted.");
        }
    }
}
