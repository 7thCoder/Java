/*
*A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, 
*each raised to the power of the number of digits in a given base. In this Kata, 
*we will restrict ourselves to decimal (base 10).

*For example, take 153 (3 digits), which is narcissistic:
* 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
*
*and 1652 (4 digits), which isn't:
* 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
*The Challenge:
*Your code must return true or false (not 'true' and 'false') 
*depending upon whether the given number is a Narcissistic number in base 10.
*/

package sample;

public class Main {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

    public static boolean isNarcissistic(int number) {
        int sum = 0;
        int i = 0;
        String str = Integer.toString(number);
        int[] result = new int[str.length()];
        
        for(i=0;i<str.length();i++){
          char ch = str.charAt(i);
          result[i]=Character.getNumericValue(ch);
        }
        
        for(int j:result){
           sum += Math.pow(j,str.length());
        }
          return (sum==number);
      }
  
}