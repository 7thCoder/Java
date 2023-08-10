/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;

/**
 *
 * @author Shako
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    
    public int getCustomerNumber(){
        return this.customerNumber;
    }
    
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    
    public int getPinNumber(){
        return this.pinNumber;
    }
    
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    
    public double getSavingBalance(){
        return this.savingBalance;
    }
    
    public double calcCheckingWithdraw(double amount){
        checkingBalance -=amount;
        return checkingBalance;
    }
    
    public double calcCheckingDeposit(double amount){
        checkingBalance += amount;
        return checkingBalance;
    }
    
    public double calcSavingWithdraw(double amount){
        savingBalance -=amount;
        return savingBalance;
    }
    
    public double calcSavingDeposit(double amount){
        savingBalance += amount;
        return savingBalance;
    } 
    
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();
        
        if((checkingBalance - amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New checking Account Balance: "+moneyFormat.format(checkingBalance));
        } else {
            System.out.println("balance cannot be Negative");
        }
    }
    
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();
        
        if((savingBalance - amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New saving Account Balance: "+moneyFormat.format(savingBalance));
        } else {
            System.out.println("balance cannot be Negative");
        }
    }
    
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit into Checking Account: ");
        double amount = input.nextDouble();
       
        calcCheckingDeposit(amount);
        System.out.println("New checking Account Balance: "+moneyFormat.format(checkingBalance));
    }
    
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: "+ moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit into Checking Account: ");
        double amount = input.nextDouble();
        
        calcSavingDeposit(amount);
        System.out.println("New Saving Account Balance: "+moneyFormat.format(savingBalance));
    }
}

