/*Two friends are playing a word puzzle game.
Initially, puzzle conatins a word Name1, they need to form another word 'Name2' 
using 'Name1'.

They can shuffle letters as per their choice.They are given a chance of adding 
one character at position of their choice.

Your task is to help them to print the character they added.


Input Format:
-------------
Strings Name1 and Name2.
 
Output Format:
--------------
Print a character, added.


Sample Input-1:
---------------
satwik 
satwika

Sample Output-1:
----------------
a


Sample Input-2:
---------------
average
averages

Sample Output-2:
----------------
s

white
awhite
a
whitae
white
*/
import java.util.*;
public class FS(A2-Batch)D9P1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2 = sc.next();
        int cnt = s2.length();
        char ch = s2.charAt(cnt-1);
        for(int i=0;i<cnt-1;i++)
        {
             ch ^=s1.charAt(i);
             ch ^=s2.charAt(i);
        }
        System.out.print(Character.toString(ch));
        // char c =0;
        // for(char c1:s1.toCharArray())
        // {
        //     c^=c1;
        // }
        // for(char c2:s2.toCharArray())
        // {
        //     c^=c2;
        // }
        // System.out.print(c);
        
    }
}
