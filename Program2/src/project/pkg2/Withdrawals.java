/*
 * Name: James Vanaselja
 * Course: CNT 4714 - Spring 2015
 * Assignment Title:
 * Date: 
 */
package project.pkg2;

import java.util.Random;

        
public class Withdrawals extends Thread{
    private static Random random = new Random();
    private Account account;
    
    public Withdrawals(String name, Account account){
        super(name);
        this.account = account;
        
    } 
    int j=0;
    @Override
    public void run(){
        //initiate infinite loop
        while (true){
           
            try {
                account.Withdrawals(random.nextInt(50)); //find value to withdraw
                   j++;
              /*  This bit of code is for debugging purposes. It quits the program
                   once 1000 withdrawls have been made.
                   if (j==1000){
                    System.out.println("Too many Withdrawals. Now Exiting");
                    System.exit(-1);
                    }*/
                if (Runtime.getRuntime().availableProcessors() == 1) {
                        Thread.yield();
                
                }
                else {
                    Thread.sleep(random.nextInt(50)); // might need to change value
                }
                
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    
}
