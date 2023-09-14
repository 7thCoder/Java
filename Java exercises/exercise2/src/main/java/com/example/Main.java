/*
 * Given a random non-negative number, 
 * you have to return the digits of this number within an array in reverse order.
 */
package com.example;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(digitize(35231));
    }

    public static int[] digitize(long n) {
        int i;
        String[] newArr =String.valueOf(Long.toString(n)).split("");
        List<Integer> result = new ArrayList<Integer>();
        
        for(i=0; i<(newArr.length); i++){
          result.add(Integer.parseInt(newArr[i]));
        }
        
        Collections.reverse(result);
        
        int size = newArr.length;
        
        int finalRes[];
        finalRes = new int[size];
        for(i=0; i<(newArr.length); i++){
          finalRes[i] = result.get(i);
        }
        return finalRes;
      }
}