/*Tanu and Manu are playing a Rangoli Game with "#", as part of the game 
Tanu has to read a group of words and double every consonant and 
place an "#" in between them . 

Sample Test Case-1
input = this is fun
output = t#th#his#s is#s f#fun#n

Explanation 
t is consonant then double the consonant and place "#" in between, 
So it becomes "t#t" and do this for full string

Sample Test Case-2
input =hello
output = h#hel#ll#lo

Explanation 
h is consonant then double the consonant and place "#" in between, 
so it become "h#h" and e is vowel so no change for it and  same for the remaining characters */

import java.util.*;
public class FS(A2-Batch)D10P3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String s1 = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'|| s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U')
            {
                s1 +=s.charAt(i);
            }
   
            else
            {
                s1+=s.charAt(i)+"#"+s.charAt(i);
            }
        }
        System.out.print(s1);
    }
}
