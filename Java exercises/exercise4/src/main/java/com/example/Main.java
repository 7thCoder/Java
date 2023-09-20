/*
 * This program carries out the square sum function
 * that is it returns the sum of the square of every numer in the array
 */
package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(squareSum(1, 2, 2));
    }

    public static int squareSum(int[] n)
    { 
        int sum = 0;
        
        for(int i:n){
            sum += Math.pow(i,2);
        }
    
        return sum;
    }
}