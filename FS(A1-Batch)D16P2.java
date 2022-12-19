/*
Professor Bessy is the favorite among the students. She teaches by using simple 
games for learning. Her students James and Martha are given a string, their task 
is to take one character at a time and write it on the board alternatively. 
Upon reaching the end of the string, the remaining characters from the other 
string is written in the same order on the board. The final string is shared 
with the class. 
Your task is to help Professor Bessy find the final string.

Sample test case

input=2
hello world
output=hweolrllod

*/
import java.util.*;
class d16p2{
    public static String merge(String s1,String s2){
        StringBuilder mr = new StringBuilder();
        for(int i = 0;i<s1.length()||i<s2.length();i++){
            if(i<s1.length()){
                mr.append(s1.charAt(i));
            }
            if(i<s2.length()){
                mr.append(s2.charAt(i));
            }
        }
        return mr.toString();
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s1 = in.next();
        String s2 = in.next();
        System.out.print(merge(s1,s2));
    }
}
