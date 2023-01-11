/*Given a positive integer n, find and return the longest distance between
any two adjacent 1's in the binary representation of n. If there are 
no two adjacent 1's, return 0.

Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
The distance between two 1's is the absolute difference between their
bit positions.

For example, the two 1's in "1001" have a distance of 3.


Sample Testcase
-----------------------------------
input:
-----------
22

output
-----------
2

Explanation: 
---------------------------
22 in binary is "10110".
The first adjacent pair of 1's is "10110" with a distance of 2.
The second adjacent pair of 1's is "10110" with a distance of 1.
The answer is the largest of these two distances, which is 2.
Note that "10110" first 1 and third 1 is not a valid pair since
there is a 1 separating the two 1's.

Sample Testcase
-----------------------------------
input:
-----------
8

output
---------------------
0
Explanation: 
--------------------
8 in binary is "1000".
There are not any adjacent pairs of 1's in the binary representation of 8, 
so we return 0.


Sample Testcase
-----------------------------------
input:
-----------
5

output
---------------------
2

Explanation: 5 in binary is "101".
*/
import java.util.*;
public class FS(A2-Batch)D27P3
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int n  = sc.nextInt();
        String s= Integer.toBinaryString(n);
        int count =0;
        int max= 0;
        int one =-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                if(one ==-1) one=i;
                else
                {
                    max= Math.max(max,i-one);
                    one = i;
                }
            }
        }
        System.out.println(max);
    }
}
