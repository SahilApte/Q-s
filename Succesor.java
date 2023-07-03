
Vishal has given a task to find the successor of a given alphabet 'alp' in a
given string str[].

The alphabets in the given string str[] are all lowercase letters and always 
in non-decreasing order.

A successor of 'alp' is the next smallest alphabet exist in the string str[] 
which is greater than 'alp'.

Assume that alphabets can be considered in cyclic fashion.
For example: Successor for alp='z' in str[]="bcd" is 'b'.

Help Vishal to retunn the answer.

Can you solve it in O(log(n)) complexity?

Input Format:
-------------
Line-1:A string str[]
Line-2: a character represents an alphabet.
 
Output Format:
--------------
Print a character which is the successor.
 
Constraints:
 2 <= str.length<= 10^4
'alp' is a lowercase letter.

 
Sample Input-1:
---------------
adghijl
f 
Sample Output-1:
----------------
g

Sample Input-2:
---------------
abcdefghi
j

Sample Output-2:
----------------
a

import java.util.*;
public class Hm
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String f = sc.next();
        int asc = (int)f.charAt(0)+1;
        HashMap<Character,Integer> hm = new HashMap<>();
        int count=s.length();
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),(int)s.charAt(i));
            }
        }
        while(count!=0)
        {
            char c = (char)asc;
            if(hm.containsKey(c))
            {
                System.out.println(c);
                return;
            }
            count--;
            asc++;
        
        }
        if(count==0)
        {
            System.out.println(s.charAt(0));
        }
    }
}
