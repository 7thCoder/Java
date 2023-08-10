/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atm;

/**
 *
 * @author Shako
 */

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptMenu extends account{
    
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");    
    HashMap <Integer, Integer> data = new HashMap <Integer,Integer>();
    
    public void getLogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(164419,123456);
                data.put(158794,212223);

                System.out.println("Welcome to ATM project: ");
                System.out.println("Enter your customer number ");
                setCustomerNumber(input.nextInt());

                System.out.println("Enter your PIN number ");
                setPinNumber(input.nextInt());
            }
            catch (Exception e){
               System.out.println("Inalid character(s). Only Numbvers.");
               x=2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if(data.containsKey(cn)&& data.get(cn)==pn){
                getAccountType();
            } else{
                System.out.println("Wrong customer or Pin Number");
            }
        }
        while(x==1);
    }
    
    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        
        int selection = input.nextInt();
        
        switch(selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATMF!");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    
    public void getChecking(){
        System.out.println("Checking Account ");
        System.out.println("Type 1 - View balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit funds");
         System.out.println("Type 4 - Exit");
        
        int selection = input.nextInt();
        
        switch(selection){
            case 1:
                System.out.println("Checking account balance: "+moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("thank you for using this ATM!");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    
    public void getSaving(){
        System.out.println("Saving Account ");
        System.out.println("Type 1 - View balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit funds");
         System.out.println("Type 4 - Exit");
        
        int selection = input.nextInt();
        
        switch(selection){
            case 1:
                System.out.println("savings account balance: "+moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("thank you for using this ATM!");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}


