/*  Mr.Venkat is playing a game of strings. As it is well known that he isn't
very bright. So he needs your help in winning this game.

The game is very simple. You are given a string S of length N and an integer K. 
You have to print first K occurences(if for any character count < K 
then print them all) of every character in the given order.

INPUT FORMAT
----------------------------------------------

First line contains 2 integers N and K.

Second line contains the string S, comprising of only lowercase alphabets.

OUTPUT FORMAT
-------------------------------

Print the required string.


Sample Testcase:
------------------------------
input :
-----------
10 3
abcaacbccb

output :
----------------------
abcaacbcb
*/
import java.util.*;
public class FS(A2-Batch)D25P1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] ch = new char[n];
        HashMap<Character ,Integer>hm =new HashMap<>();
        String ans = "";
            for(int i=0;i<n;i++)
            {
                hm.put(s.charAt(i),0);
            }
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
               if(hm.get(s.charAt(i))<k)
               {
                   System.out.print(s.charAt(i));
                   hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
               }
            }
 
        }
}}
