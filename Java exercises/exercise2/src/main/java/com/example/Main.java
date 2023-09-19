/*
 * Given a random non-negative number, 
 * you have to return the digits of this number within an array in reverse order.
 */
package com.example;
import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args){
    System.out.println(solution("Stream","eam"));
    System.out.println(solution("testis","is"));
  }

  public static boolean solution(String str, String ending) {
    
    StringBuilder res = new StringBuilder();
    int i=0;
    int size = ending.length();
    int size2 = str.length() - size;
    i = size2;
    
    while(i <(str.length()) ){
       res.append(str.charAt(i));
       i++;
    }
    
    
    String fnal = res.toString();
    
    System.out.println("collected string: " + fnal);
    return fnal.equals(ending);
  }
}