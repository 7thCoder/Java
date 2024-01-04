/*
    Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

    Examples
        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
        pigIt('Hello world !');     // elloHay orldway !
*/
package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(pigIt("my name is shao"));
    }

    public static String pigIt(String str) {
        String[] arr = str.split("\\s+");

        StringBuilder s = new StringBuilder();

      for(String i:arr){
        String temp = Character.toString(i.charAt(0));
        StringBuffer sr = new StringBuffer(i);
        
        sr.deleteCharAt(0);
        
        s.append(sr).append(temp).append("ay").append(" ");

      }
      
      return s.toString();
    }
}