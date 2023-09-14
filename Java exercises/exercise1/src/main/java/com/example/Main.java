/*
 * This program checks if an element is found in an array
 */
package com.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(check(new Object[] {12,66,34,97},66 ));
    }

    public static boolean check(Object[] a, Object x) {
        
        List<Object> list = Arrays.asList(a);
          return list.contains(x);
      }
}