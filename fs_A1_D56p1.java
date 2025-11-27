/*
Suraj and Tom are two best friends. 

Both of them have given two Strings S1 and S2 
Suraj has given String S1 and Tom has given String S2
Suraj is always bothered about Tom Strings and checks if his string follows 
sub sequence of Tom strings or not 

Help Suraj to solve his problem 

A sub sequence of  string is a new string which is formed from the original 
string by removing some (can be none) of the characters without
disturbing the relative positions of the remaining characters. 


Sample Test Case

case=1
input=aa
aaaa
output=true

case=2
input=ahga
ahgijk
output=false

*/
import java.util.*;
class d56p1{
    public static boolean check(String s1,String s2){
        int i = 0, j = 0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        if(i == s1.length()){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(check(s1,s2));
    }
}
