/*
Bablu is playing a word puzzle game.
Initially, puzzle conatins a word S, you need to form another word 'T' using 'S'.

The game rules are as follows:
	1. You can jumble the letters in the given word as your need.
	2. You can add only one letter to the jumbled word at any position.
	
You are given two words, S and T.
Your  task is to find and print the newly added character to S to form T.

Sample test case

input=2
tore tower
output=w

*/
import java.util.*;
class d17p1{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s1 = in.next();
        String s2 = in.next();
        /*
        int i1 = 0,i2 = 0;
        int k1 = s1.length();
        int k2 = s2.length();
        if(Math.abs(k1-k2)==1){
         if(k1>k2){
             i1 = k1;
             i2 = k2;
         }
         if(k1<k2){
             i1 = k2;
             i2 = k1;
         String temp = s1;
         s1 = s2;
         s2 = s1;
         }
        }
        for(int i = 0;i<i1;i++){
            for(int j = 0;j<i2;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    System.out.print(s1.charAt(i)+"");
                }
            }
        }
        */
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        char ch = '\0';
        for(int i = 0;i<arr.length;i++){
            ch = (char)(ch^arr[i]);
        }
        for(int j = 0;j<arr1.length;j++){
            ch = (char)(ch^arr1[j]);
        }
        System.out.println(ch);
    }
}
