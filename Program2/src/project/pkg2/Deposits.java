/*
 * Name: James Vanaselja
 * Course: CNT 4714 - Spring 2015
 * Assignment Title:Project 2 – Synchronized, Cooperating Threads Under Locking
 * Date: Sunday, Feburary 14, 2016
 * 
 */
package project.pkg2;

import java.util.Random;

/**
 *
 * @author James
 */
public class Deposits extends Thread {
    
    private Random depositAmount = new Random();
    private Random SleepTime = new Random();
    private Account account;

    public Deposits(String Name, Account account) {
        super(Name);
        this.account = account;
    }
    //int i=0;
    @Override
    public void run() {
        //infinite loop
        while (true) {
            try {
                //Amount of $$$ deposited is a random int value up to $200
                account.Deposits(depositAmount.nextInt(200));
                //Sleep Time
                Thread.sleep(SleepTime.nextInt(250));
             /*   This bit of code is for debugging
                It will exit the program once 100 deposits have been made.
                i++;
                if (i==100){
                       System.out.println("Too many deposits. Now Exiting");
                    System.exit(-1);
                }*/
            } catch (InterruptedException ex) {
                ex.printStackTrace();

            }
        }
    }
}
