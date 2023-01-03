/*Chitti Naidu is a school kid, writing a series of numbers in a special way.

The series is looks like following: 
	- For example, starting number is 25
	- Next number in the series is, count of digit groups like "one 2 and one 5'
	, written as 1215.
	- Next number in the series is, count of digit groups like "one 1, one 2, 
	  one 1 and one 5', written as 11121115 and so on.

You will be given a string S (A number), an integer N, where S is the
starting number of series, You need to find the N-th term in the series. 

Note: Each term of the series of integers will be represented as a string.

Input Format:
-------------
A String S and an integer N

Output Format:
--------------
Print the N-th term in the series starts with S.


Sample Input-1:
---------------
25 3
1215
11121115
31123115

Sample Output-1:
----------------
11121115
if(i = i+1)
    ch = i
    CNT++
COUNT =1+1+1

else{
CNT =1
store = cnt.toString() +ch.toString() 
}
kk(store);




Sample Input-2:
---------------
21 4

Sample Output-2:
----------------
312211

Explanation:
---------------
1st term, S = 12
2nd term is "one 2 one 1" -> "1211",
3rd term is "one 1, one 2, two 1's " -> "111221"
Finally 4th term is  "three one's, two 2's, one 1" -> "312211".

 21
 1211
 111221
 3122112
 
 25
 1215
 11121115
 3112315
 132112131115
 21
 1211
 111221
 312211
*/

import java.io.*;
import java.util.*;
public class FS(A2-Batch)D26P2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] s5 = sc.nextLine().split(" ");
        String s = s5[0];
        int k = Integer.parseInt(s5[1]);
        int cnt =1;
        int i =0;
        String store =s;
        for(int j=0;j<k-1;j++)
        {
            String ans = "";
        for(i=0;i<store.length();i++)
        {
            char ch = store.charAt(i);
            if(i!=store.length()-1&&ch==store.charAt(i+1))
            {
                cnt++;
            }
            else
            {
                ans =ans+String.valueOf(cnt)+Character.toString(ch);
                cnt =1;
            }
        }
        store = ans;
        }
        System.out.println(store);
    }
}
