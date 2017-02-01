/*
 * Name: James Vanaselja
 * Course: CNT 4714 - Spring 2015
 * Assignment Title:
 * Date:
//Copyright James Vanaselja 2016. All Rights Reserved. 
 */
package program.pkg1.event.driven.programming;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class Frontend extends javax.swing.JFrame {

    int CurrentOrder = 1;
    int NumOrder = 0;
    int NumItemsInOrderCounter = 0;
    int flag = 0;
    double price = 0.00;
    double FinalPrice = 0.00;
    double subtotal = 0.0;
    double subtotal2 = 0.0;
    double subtotal3 = 0.0;
    double subtotal4 = 0.0;
    String InfoDiscount = null;
    String InvalidOrder = null;
    ArrayList OrderList = new ArrayList();
    ArrayList<String> BookList = new ArrayList();
    ArrayList PriceList = new ArrayList();
    ArrayList<String> OrderMessageList = new ArrayList();
    ArrayList<String> TransactionList = new ArrayList();

    /**
     * Creates new form Frontend.
     */
    public Frontend() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        ProcessItem = new javax.swing.JButton();
        ConfirmItemButton = new javax.swing.JButton();
        ViewOrderButton = new javax.swing.JButton();
        FinishOrderButton = new javax.swing.JButton();
        NewOrderButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        NumItems = new javax.swing.JLabel();
        BookID = new javax.swing.JLabel();
        ItemQuantity = new javax.swing.JLabel();
        ItemInfo = new javax.swing.JLabel();
        OrderSubtotal = new javax.swing.JLabel();
        QuantityField = new javax.swing.JFormattedTextField();
        infoField = new javax.swing.JFormattedTextField();
        SubTotalField = new javax.swing.JFormattedTextField();
        BookIDField = new javax.swing.JFormattedTextField();
        NumItemsField = new javax.swing.JFormattedTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        ProcessItem.setText("Process Item #" + CurrentOrder);
        ProcessItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessItemActionPerformed(evt);
            }
        });

        ConfirmItemButton.setText("Confirm Item #"+ CurrentOrder);
        ConfirmItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmItemButtonActionPerformed(evt);
            }
        });

        ViewOrderButton.setText("View Order");
        ViewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderButtonActionPerformed(evt);
            }
        });

        FinishOrderButton.setText("Finish Order");
        FinishOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishOrderButtonActionPerformed(evt);
            }
        });

        NewOrderButton.setText("New Order");
        NewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrderButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        NumItems.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NumItems.setText("Enter number of items in this order:");

        BookID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BookID.setText("Enter Book ID for Item #" + CurrentOrder);

        ItemQuantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ItemQuantity.setText("Enter quantity for Item #" + CurrentOrder);

        ItemInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ItemInfo.setText("Item #" + CurrentOrder + " info:");

        OrderSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        OrderSubtotal.setText("Subtotal for " + NumItemsInOrderCounter + " items(s)");

        QuantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityFieldActionPerformed(evt);
            }
        });

        infoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoFieldActionPerformed(evt);
            }
        });

        SubTotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ItemQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OrderSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SubTotalField)
                            .addComponent(QuantityField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ProcessItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfirmItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ViewOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FinishOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewOrderButton)
                        .addGap(18, 18, 18)
                        .addComponent(ExitButton)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NumItems, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(BookID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumItemsField)
                            .addComponent(BookIDField))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumItems)
                    .addComponent(NumItemsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookID)
                    .addComponent(BookIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemQuantity)
                    .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemInfo)
                    .addComponent(infoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderSubtotal)
                    .addComponent(SubTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProcessItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ConfirmItemButton)
                        .addComponent(ViewOrderButton)
                        .addComponent(FinishOrderButton)
                        .addComponent(NewOrderButton)
                        .addComponent(ExitButton)))
                .addContainerGap())
        );

        ConfirmItemButton.setEnabled(false);
        ViewOrderButton.setEnabled(false);
        FinishOrderButton.setEnabled(false);
        infoField.setEnabled(false);
        infoField.setEditable(false);
        SubTotalField.setEnabled(false);
        SubTotalField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessItemActionPerformed

        int quantity = 0;
        int OrderNum = 0;
        double PriceNum = 0.0;
        String match = null;
        String input = null;
        NumOrder = (int) Double.parseDouble(NumItemsField.getText());

        quantity = (int) Double.parseDouble(QuantityField.getText());
        String itemID = BookIDField.getText();
        //System.out.print("Item ID:" + itemID);
        //check make sure value is in file.

        //System.out.println(itemID);
        String[] Order = null;
        String BookTitle = null;
        String[] Price = null;

        try {

            Scanner scanner = new Scanner(new FileInputStream("inventory.txt"));
            while (scanner.hasNextLine()) {

                input = (scanner.nextLine());
                Order = input.trim().split(",", 3);

                // System.out.println("Input String: " + input + " End");
                if (input.contains(itemID) == true) {
                    match = input;
                    /* InfoDiscount = input;
                     InfoDiscount = InfoDiscount.replaceAll(",", " ");
                     */ CurrentOrder++;
                    OrderNum = Integer.parseInt(Order[0]);

                    BookTitle = Order[1];
                    PriceNum = Double.parseDouble(Order[2]);
                    OrderList.add(Order[0]);
                    BookList.add(BookTitle);
                    PriceList.add(Order[2]);
                    System.out.println("\nOrder: " + OrderNum + "\nBook: "
                            + BookTitle + "\nPrice: " + PriceNum);
                    break;

                }

            }
            price = PriceNum;
            if (OrderList.contains(itemID) != true) {
                System.out.println("error");
                System.out.println("error: " + OrderList.toString());
                flag++;
                InvalidOrder = itemID;

            }

            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            System.exit(-1);
        }

        //Apply Discount
        
        InfoDiscount = (OrderNum + ", "+ BookTitle + ", "+"$" + PriceNum + " " + 
                ", " + quantity);
        if (NumOrder >= 1 && NumOrder < 5) {
            // System.out.println("Discount is 0%");
            price = PriceNum * quantity;
             String priceformat = new DecimalFormat("##.00").format(price);
           InfoDiscount = (InfoDiscount + "," + " 0.0"+"% " + "$" + priceformat + "\n");
            
            TransactionList.add(InfoDiscount);
            InfoDiscount = InfoDiscount.replaceAll(",", "");            
            OrderMessageList.add(InfoDiscount);

            subtotal += price;
         
        } else if (NumOrder >= 5 && NumOrder < 10) {
            // System.out.println("Discount is 10%");
            
            price = price - (price * (.10));
            price = price * quantity;            
            subtotal2 += price;
            String priceformat = new DecimalFormat("##.00").format(price);
            InfoDiscount = (InfoDiscount +", "+ "10%" +", " + "$" + priceformat+ ","+ "\n");
            
            TransactionList.add(InfoDiscount+ "\n");
            InfoDiscount = InfoDiscount.replaceAll(",", "");            
            OrderMessageList.add(InfoDiscount);
          
            System.out.println("Subtotal is: ");
        } else if (NumOrder >= 10 && NumOrder < 15) {
            //System.out.println("Discount is 15%");
             price = price - (price * (.15));
            price = price * quantity;
            subtotal3 += price;
            InfoDiscount = (InfoDiscount + ", " + "15% " + "$" + PriceNum+ ","+"\n");
            TransactionList.add(InfoDiscount+ "\n");
            InfoDiscount = InfoDiscount.replaceAll(",", ""); 
            OrderMessageList.add(InfoDiscount);
          
           
         
            System.out.println("Subtotal is: ");
        } else if (NumOrder >= 15) {
            // System.out.println("Discount is 20%");
            price = price - (price * (.20));
            price = price * quantity;
            subtotal4 += price;
            
            InfoDiscount = (InfoDiscount +", "+ " 20% " + "$" + PriceNum + ","+"\n");
            TransactionList.add(InfoDiscount);
            
            InfoDiscount = InfoDiscount.replaceAll(",", ""); 
            OrderMessageList.add(InfoDiscount);
          
            System.out.println("Subtotal is: ");
        } else {
            // System.out.println("Invalid number of items " + NumOrder);
            System.out.println("Invalid");
        }
        FinalPrice = subtotal + subtotal2 + subtotal3 + subtotal4;
        /*  Iterator<String> itr = OrderList.iterator();

         while (itr.hasNext()) {
         System.out.println("List: " + itr.next());
         }
         */
        //set field to match
        infoField.setText(InfoDiscount);
        ConfirmItemButton.setEnabled(true);
        NumItemsField.setEditable(false);
        NumItemsField.setEnabled(false);
        ProcessItem.setEnabled(false);

    }//GEN-LAST:event_ProcessItemActionPerformed
//Copyright James Vanaselja 2016. All Rights Reserved. 
    private void ConfirmItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmItemButtonActionPerformed
        //launch message box
        if (flag == 0) {

            String message = ("Item #" + (CurrentOrder - 1) + " accepted");
            JOptionPane.showMessageDialog(null, message);
            ViewOrderButton.setEnabled(true);
            FinishOrderButton.setEnabled(true);
            ProcessItem.setEnabled(true);
            ConfirmItemButton.setEnabled(false);
            ConfirmItemButton.setText("Confirm Item #" + CurrentOrder);
            BookID.setText("Enter Book ID for Item #" + CurrentOrder);
            ItemQuantity.setText("Enter quantity for Item #" + CurrentOrder);
            ProcessItem.setText("Process Item #" + CurrentOrder);
            BookIDField.setText("");
            QuantityField.setText("");
            NumItemsInOrderCounter++;
            infoField.setText(InfoDiscount);
            //System.out.println("NumOrder is :"+NumOrder);
            //System.out.println("NumItemsInOrder :" + NumItemsInOrderCounter);
            if (NumOrder == NumItemsInOrderCounter) {

                //System.out.println("Stop!!!");
                BookID.setVisible(false);
                ItemQuantity.setVisible(false);
                BookIDField.setEnabled(false);
                BookIDField.setEditable(false);
                QuantityField.setEnabled(false);
                QuantityField.setEditable(false);

            }
            String numberformat = new DecimalFormat("##.00").format(FinalPrice);
            SubTotalField.setText("$" + numberformat);
            OrderSubtotal.setText("Order Subtotal for " + NumItemsInOrderCounter
                    + " items(s)");
        } else {
            String message2 = ("Book ID " + InvalidOrder + " not in file");
            JOptionPane.showMessageDialog(null, message2);
        }
    }//GEN-LAST:event_ConfirmItemButtonActionPerformed
//Copyright James Vanaselja 2016. All Rights Reserved. 
    private void ViewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrderButtonActionPerformed
        //View Order Button
        int index = 1;
        String ViewOrder = "";

        for (int i = 0; i < NumItemsInOrderCounter; i++) {
            ViewOrder += (index + ". " + OrderMessageList.get(i) + "\n");
            index++;
        }

        JOptionPane.showMessageDialog(null, ViewOrder);


    }//GEN-LAST:event_ViewOrderButtonActionPerformed

    private void FinishOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishOrderButtonActionPerformed
        //Display Message to console
        int index = 1;
        int TaxRate = 6;
        double TaxAmount = 0.0;
        double OrderTotal = 0.0;
        TaxAmount =  (FinalPrice * (TaxRate * .01));
         String TaxString = new DecimalFormat("##.00").format(TaxAmount);
        String ViewOrder = "";
        OrderTotal = TaxAmount + FinalPrice;
        String OrderTotalString = new DecimalFormat ("##.00").format(OrderTotal);
        String SubTotal = new DecimalFormat ("##.00").format(FinalPrice);
        for (int i = 0; i < NumItemsInOrderCounter; i++) {
            ViewOrder += (index + "." + OrderMessageList.get(i) + "\n");
            index++;
        }
       
        DateFormat df = new SimpleDateFormat("M/DD/YY hh:mm:ss a z");
        df.setTimeZone(TimeZone.getDefault());
        Date date = new Date();
        System.out.println(df.format(date));
        String output = ("Date: " + df.format(date)
                + "\n\nNumber of line items: " + NumItemsInOrderCounter + 
                "\n\nItem#/ID/Title/Price/Qty/Disc%/Subtotal:\n\n"
                + ViewOrder + "\n\nOrder subtotal: " + " $"+ SubTotal
                + "\n\nTax rate:  " + TaxRate + "%" + "\n\nTax amount: " + " $"+
                TaxString + "\n\nOrder total: " +" $" + OrderTotalString + 
                "\n\n Thanks for shopping at James's Bookstore!");
        JOptionPane.showMessageDialog(null, output);

        //Write to file
        
      
        //first date
        DateFormat OutputDF = new SimpleDateFormat("YYMMDDHHMMSS");
        //second date
        DateFormat EndOutput = new SimpleDateFormat("M/DD/YY hh:mm:ss a z");
         String fileOutput = "";
        String WriteOrder = "";
      
           for (int i = 0; i < NumItemsInOrderCounter; i++) {
            WriteOrder += ( OutputDF.format(date) +" " +  TransactionList.get(i)
                    + " " + EndOutput.format(date)+ " " + System.lineSeparator());
            
            index++;
            
        /*fileOutput = (OutputDF.format(date) + ", " + WriteOrder + EndOutput.format(date) +
                " " +"\n" );
        */
        try {
            File file = new File("transactions.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream FO = new FileOutputStream(file.getAbsoluteFile());
            //FileWriter fw = new FileWriter(file.getAbsoluteFile());
            //BufferedWriter bw = new BufferedWriter(fw);
            byte[] bytearray = WriteOrder.getBytes();
            FO.write(bytearray );
            
            FO.flush();
            FO.close();
            //bw.write(WriteOrder);
           //bw.write("\n");
           
            //bw.close();
           // fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

           }
    }//GEN-LAST:event_FinishOrderButtonActionPerformed

    private void QuantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityFieldActionPerformed

    }//GEN-LAST:event_QuantityFieldActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        //Exit when pressed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void NewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewOrderButtonActionPerformed
        //Delete data from fields
        dispose();
        Frontend front = new Frontend();
        front.setTitle("James's Bookstore");
        front.setVisible(true);
      
        /*
        NumItemsInOrderCounter = 0;
        FinalPrice = 0.00;
        price = 0.0;
        subtotal = 0.0;
        CurrentOrder = 1;
        QuantityField.setText("");
        BookIDField.setText("");
        SubTotalField.setText("");
        NumItemsField.setText("");
        infoField.setText("");
        QuantityField.setVisible(true);
        QuantityField.setEnabled(true);
        QuantityField.setEditable(true);
        BookIDField.setVisible(true);
        BookIDField.setEnabled(true);
        BookID.setVisible(true);
        BookIDField.setEditable(true);
        NumItemsField.setEditable(true);
        NumItemsField.setEnabled(true);
        ProcessItem.setEnabled(true);
        ViewOrderButton.setEnabled(false);
        ItemQuantity.setVisible(true);
        FinishOrderButton.setEnabled(false);
        OrderSubtotal.setText("Order Subtotal for " + NumItemsInOrderCounter
                + " items(s)");
        ConfirmItemButton.setText("Confirm Item #" + CurrentOrder);
        BookID.setText("Enter Book ID for Item #" + CurrentOrder);
        ItemQuantity.setText("Enter quantity for Item #" + CurrentOrder);
        ProcessItem.setText("Process Item #" + CurrentOrder);
        */
    }//GEN-LAST:event_NewOrderButtonActionPerformed

    private void infoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoFieldActionPerformed

    private void SubTotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTotalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frontend().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookID;
    private javax.swing.JFormattedTextField BookIDField;
    private javax.swing.JButton ConfirmItemButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton FinishOrderButton;
    private javax.swing.JLabel ItemInfo;
    private javax.swing.JLabel ItemQuantity;
    private javax.swing.JButton NewOrderButton;
    private javax.swing.JLabel NumItems;
    private javax.swing.JFormattedTextField NumItemsField;
    private javax.swing.JLabel OrderSubtotal;
    private javax.swing.JButton ProcessItem;
    private javax.swing.JFormattedTextField QuantityField;
    private javax.swing.JFormattedTextField SubTotalField;
    private javax.swing.JButton ViewOrderButton;
    private javax.swing.JFormattedTextField infoField;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
