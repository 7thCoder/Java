/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author Shako
 */
import java.util.Scanner;
public class readInput {
    
    public static String read(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input expressions (for eg: 4*3/2)");
        String inputLine = scanner.nextLine();
        
        scanner.close();
        return inputLine;
    }
}
