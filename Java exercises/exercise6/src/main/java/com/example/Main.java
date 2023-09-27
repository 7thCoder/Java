/*
* program fro printing out a pyramid in Java
*/
package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(towerBuilder(4));
    }
    public static String[] towerBuilder(int nFloors)
    {
        String[] res = new String[nFloors];
        String[] resu = new String[nFloors];
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;
        int  x = nFloors;
        int y = x;
        for(i = 0; i<nFloors; i++){
        while(j <= i){            
            str.append("*");
            j++;
        }
        res[i] = str.toString();
        }
        i = 0;
        for(String a:res){
           resu[i] = a;
           i++;
        }

        return resu;
        
    }
}