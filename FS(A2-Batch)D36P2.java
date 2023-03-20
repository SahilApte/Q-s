Given two strings word1 and word2, return the minimum number of operations 
required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
 
Sample Testcase:
-----------------------------------------
input: word1 = "horse", word2 = "ros"
output= 3  

Explanation: 
---------------------------------------
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')


Sample Testcase:
-----------------------------------------
Input: word1 = "intention", word2 = "execution"
output: 5

Explanation: 
---------------------------------------
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')

import java.util.*;
public class DP
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int m = s1.length();
        int n = s2.length();
        System.out.println(Recursive(s1,s2,m,n));
        
    }
    public static int Recursive(String s1,String s2,int m,int n)
    {
        if(n==0)return m;
        if(m==0)return n;
        if(s1.charAt(m-1) == s2.charAt(n-1))
        {
            return Recursive(s1,s2,m-1,n-1);
        }
        else
        {
            int insert=Recursive(s1,s2,m,n-1)+1;
            int del = Recursive(s1,s2,m-1,n)+1;
            int replace = Recursive(s1,s2,m-1,n-1)+1;
            int result =  Math.min(del,Math.min(replace,insert));
            return result;
        }
    }
}
 
