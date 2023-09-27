/*
 * This program loops through an array
 * and finds all the peaks(elements greater than their previous neighbours)
 * and their positions in the array
 * Note: first and last elements are not considered because you don't know what comes after or before
*/

package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      int[] array = {1,2,3,6,4,1,2,3,2,1};
      System.out.println(getPeaks(array));
    }

    public static Map<String,List<Integer>> getPeaks(int[] arr) {
      int i = 0;
      
      Map<String,List<Integer>> ls = new HashMap<>(); 
      ls.put("Pos", new ArrayList<>());
      ls.put("Peak", new ArrayList<>());
        
      for(i = 1; i <= arr.length -1; i++){
        if((arr[i]) > (arr[i-1]) && arr[i] > (arr[i+1])){
          ls.get("Pos").add(i);
          ls.get("Peak").add(arr[i]);
        }
      }

        return ls;
    }
}