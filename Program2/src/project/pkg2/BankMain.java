/*
 * Name: James Vanaselja
 * Course: CNT 4714 - Spring 2015
 * Assignment Title: Project 2 – Synchronized, Cooperating Threads Under Locking
 * Date: Sunday, Feburary 14, 2016
 */
package project.pkg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author James
 */
/*This class launches the threads*/
public class BankMain {

    private static final int STARTING_BALANCE = 0;
    private static final int NUM_DEPOSIT_THREADS = 3; //3 deposit threads
    private static final int NUM_WITHDRAWAL_THREADS = 6;// 6 withdrawal threads
 
    public static void main(String[] args) {
        int ThreadCounter = 0;
      
       Account account = new Account(STARTING_BALANCE);
       List<Thread> ThreadList = new ArrayList<>();
       
       new Deposits (++ThreadCounter + "", account).start(); //execute thread
       
        for (int i = 0; i <= NUM_DEPOSIT_THREADS; i++) {
            ThreadList.add(new Deposits(++ThreadCounter + "", account));
		}
        for (int i = 1; i <= NUM_WITHDRAWAL_THREADS; i++) {
            ThreadList.add(new Withdrawals(++ThreadCounter + "", account));
		}
        Collections.shuffle(ThreadList);
        ThreadList.stream().forEach((thread) -> {
            thread.start();
        });
    }
    
}
