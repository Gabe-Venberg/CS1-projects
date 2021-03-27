/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * BankAccountTest program created for CS1 class.
 * @author toric
 */
public class BankAccountTest {
    public static void main(String[] args) {
        
        //initalize the first account
        BankAccount account1 = new BankAccount();
        
        //inital deposit
        account1.deposit(1000);
        
        //print amount
        System.out.println("account 1 has $"+account1.getBalance());
        
        //withdraw
        account1.withdraw(250);
        
        //second account
        BankAccount account2 = new BankAccount(500);
        
        //print balance
        System.out.println("account 2 has $"+account2.getBalance());
        
        //withdraw 100.
        account2.withdraw(100);
        
        //link the two accounts.
        account2 = account1;
        
        //deposit
        account1.deposit(50);
        
        System.out.println("account 1 has $"+account1.getBalance());
        System.out.println("account 2 has $"+account2.getBalance());
    }
}