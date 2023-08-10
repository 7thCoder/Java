/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *Date: 10/08/2023
 * @author Shako
 */

import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        final String input = readInput.read();
        
        Queue<String> operations;
        Queue<String> numbers;
        
        String numbersArr[]=input.split("[-+*/]");
        String operArr[]=input.split("[0-9]+");
        
        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operations = new LinkedList<String>(Arrays.asList(operArr));
        
        Double res = Double.parseDouble(numbers.poll());
        
        while(!numbers.isEmpty()){
            String opr = operations.poll();  
            
            Operate operate;
            switch(opr){
                case "+":
                    operate = new add();
                    break;
                case "-":
                    operate = new subtract();
                    break;
                case "*":
                    operate = new multiply();
                    break;  
                case "/":
                    operate = new divide();
                    break;
                default:
                    continue;
            }
            Double num = Double.parseDouble(numbers.poll());
        
            res = operate.getResult(res, num);
        }
        
        System.out.println(res);       
    }
}
