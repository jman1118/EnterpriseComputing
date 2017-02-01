/*
 * Name: James Vanaselja
 * Course: CNT 4714 - Spring 2015
 * Assignment Title: Project 2 – Synchronized, Cooperating Threads Under Locking
 * Date: Sunday, Feburary 14, 2016
 *
 */
package project.pkg2;

/**
 *
 * @author James
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private long Balance;
    private Lock bLock = new ReentrantLock();
    private Condition InsuffientFunds = bLock.newCondition();
    //public long output = 0;

    public Account(long Balance) {
        this.Balance = 0;
        //this.Balance = Balance;
        //Formatted using printf to generate correct output.
        System.out.printf("%-25s%-25s%-25s%n", "Deposit Threads",
                "Withdrawal Threads", "Balance");
        System.out.printf("%-25s%-25s%-25s%n", "---------------",
                "------------------", "-------");
    }

    public void Deposits(long DepositAmount) throws InterruptedException {
        bLock.lock();
        try {
            //deposit money
            Balance = Balance + DepositAmount;
            /*System.out.println(Balance);
             DepositAmount = 500000;*/
            //System.out.println(DepositAmount);
            System.out.printf("%-25s%-25s%-25s%n", String.format("Thread %s deposits $%d",
                Thread.currentThread().getName(), DepositAmount),
                "", String.format("Balance is $%d", Balance));
            //this.output = DepositAmount;
            InsuffientFunds.signalAll();

        } finally {
            bLock.unlock();
        }
    }

    public void Withdrawals(long WithdrawalAmount) throws InterruptedException {
        bLock.lock();
        try {
            while (Balance < WithdrawalAmount) {
                System.out.printf("%-25s%-50s%n", "",
                   String.format("Thread %s withdraws $%d Withdrawal - Blocked - "
                       + "Insufficent Funds", Thread.currentThread().getName(),
                       WithdrawalAmount));
                InsuffientFunds.await();
                
            }
            //Withdraw money
            Balance = Balance - WithdrawalAmount;
            System.out.printf("%-25s%-25s%-25s%n", "",
                    String.format("Thread %s withdraws $%d", 
                    Thread.currentThread().getName(), WithdrawalAmount),
                    String.format("Balance is $%d", Balance));

        } finally {
            bLock.unlock();
        }

    }
}
