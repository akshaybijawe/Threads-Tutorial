package com.akshaybijawe.synchronization;

/**
 * @author arbijawe on 3/20/18
 * @project Threads-Tutorial
 */

/*
*  ID class contains the synchronized keyword to prevent
*  multiple threads from accessing the getID() method at the same time.
*/
public class ID {

    //initialized to 0 by default
    private static int counter;

    public static synchronized int getID(){
        return counter++;
    }
}
