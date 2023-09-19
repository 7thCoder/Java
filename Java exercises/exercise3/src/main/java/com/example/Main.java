/*
 * Task: Complete the solution so that it returns true if the first argument(string) passed in ends 
 * with the 2nd argument (also a string).
 */

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("!@#$%^&*() :-)", ":-)"));
        System.out.println(solution("abc", "abcd"));
    }
  
    public static boolean solution(String str, String ending) {
        
        StringBuilder res = new StringBuilder();
        int i=0;
        int size = ending.length();
        int size2 = str.length() - size;
        i = size2;
        
        try{
            while(i <(str.length()) ){
            res.append(str.charAt(i));
            i++;
        }
        }
        catch(Exception e){
        return false;
        }
        
        String fnal = res.toString();
        
        System.out.println("collected string: " + fnal);
        return fnal.equals(ending);
    }
     
}