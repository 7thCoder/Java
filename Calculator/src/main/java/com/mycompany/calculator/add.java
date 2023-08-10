/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author Shako
 */
public class add implements Operate{
    @Override
    public Double getResult(Double... numbers){
        Double sum = 0.0;
        
        for(Double num: numbers){
            sum += num;
        }
        
        return sum;
    }   
}
