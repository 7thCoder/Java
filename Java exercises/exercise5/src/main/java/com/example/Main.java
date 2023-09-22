/*
 * This is a brief of the exercise:
 * You probably know the "like" system from Facebook and other pages.
 *  People can "like" blog posts, pictures or other items. 
 * We want to create the text that should be displayed next to such an item.
 * Implement the function which takes an array containing the names of people that like an item. 
 * It must return the display text as shown in the examples:
    []                                -->  "no one likes this"
    ["Peter"]                         -->  "Peter likes this"
    ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
    ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
    ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 */
package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("me", "you", "us", "them","they","she"));
    }

    public static String whoLikesIt(String... names) {
        int count = 0;
        int num = 0;
        StringBuilder str  = new StringBuilder();
          if (names == null || names.length == 0) {
            str.append("no one likes this");
          }else if((names.length) == 1){
            str.append(names[0] + " likes this");
          }else if(names.length == 2){
            str.append(names[0] + " and " + names[1] +" like this");
          }
          else if(names.length == 3){
            for(String i:names){
              if(count < (names.length -2)){
                str = str.append(i + ", ");
                count ++;
              }
          }   
             str.append(names[(names.length)-2]);
            str.append(" and " + names[(names.length)-1]).append(" like this");
          }else if(names.length > 3){
            str.append(names[0] + ", " + names[1] +" and ");
            num = names.length - 2;

            str.append(num +" others like this");
          }
          return str.toString();
        }      
      
}