/*Given an array nums of integers, return how many of them contain an even 
number of digits.


If the array number doesn't contain the even number of digits then print 0

Input Format
-----------------------------------
Note - First line of input contains the size of array
second line of input contains the array elements


Sample Test Case:1
----------------------------
input
-----------------
5
12 345 2 6 7896

output
----------------
2

Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.



Sample Test Case:1
----------------------------
input
-----------------
4
555 901 -482 -1771

output
-----------------
1 

Explanation: 
Only 1771 contains an even number of digits.



Testcases
-----------------------------

case = 1
input = 5
1 2 3 4 5
output = 0

case = 2
input = 5
22 13 15 123 101
output = 3

case = 3
input = 4
1 2 11 12
output = 2

case = 4
input = 10
1 2 3 4 5 6 7 8 111 1234 
output = 1
*/*/
import java.util.*;
public class FS(A2-Batch)D18P3
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        int count =0;
        for(int i=0;i<n;i++)
        {
            lst.add(Math.abs(sc.nextInt()));
        }
        for(int i=0;i<n;i++)
        {
            String s = lst.get(i).toString();
            if(s.length()%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
