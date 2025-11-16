There is an id code that is supposed to be given to all the aspirants of
an exam. It is actually a substring of a given string. That means, 
the authority takes a string and then assigns all the unique substrings
to all the students. Suppose there is a string “abcde”, so the ids of
the students will be 
“a”,”b”,”c”,”d”,”e”,’ab”,”abc”,”abcd”,”abcde”,”bc”,”bcd”,”bcde”,”cd”,”cde”,”de”.

The students are standing in a line according to the lexicographic order of
their given ids. You have to find out the id of the last student for the 
given input string from which the ids are generated.

 

Input Format:
---------------------------------------------------------
Single line with the id generating string

Output format:
-------------------------------------------------------
The last id as per lexicographical order

Sample Testcase:
-----------------------------------
input=abdc
output=dc

Explanation:
-------------------------------------------
The last student will be with the id dc. The order will be
abdc
a
ab
abd
abdc
b
bd
bdc
c
d
dc

import java.util.*;
public class File
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        
        
        if(s.length()%2==0)
        {
            System.out.print(s.charAt(s.length()-2));
            System.out.print(s.charAt(s.length()-1));
        }
        else
        {
            System.out.print(s.charAt(s.length()-1));
        }
    }
}
