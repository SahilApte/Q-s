/*Write a program to  check the given two strings are anagrams or not ? 
if they are anagrams print 1 else print -1.
An anagram is a word or phrase that's formed by rearranging the letters
of another word or phrase.

case = 1
input = 
god
dog
output =1

case = 2
input =
124
411
ouput =-1
*/

import java.util.*;
public class FS(A2-Batch)D16P5
{
    //1,4,5
    public static void main(String ars[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        StringBuilder sb = new StringBuilder(s1);
        // String f = sb.reverse().toString();
        if(s.length()!=s1.length())
        {
            System.out.print("-1");
            System.exit(0);
        }
        String f="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            f +=s.charAt(i);
        }
        // System.out.print(f);
        if(f.equals(s1))
        {
            System.out.print(1);
            
        }
        else
        {
            System.out.print(-1);
        }
    }
}
