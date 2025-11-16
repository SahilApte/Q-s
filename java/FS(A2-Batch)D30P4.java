/*
Ms.Rama is fascinated by anything she considers to be a twin. 
She calls a pairs of positive integers, i and j, twins if:
-A number is an integer greater than 1 that has no positive divisors 
other than 1 and itself.
-Their absolute difference is exactly equal to  2(i.e.|j-i|=2).

Given an inclusive interval of integers from n to m, 
can you help Rama find the number of pairs of twins there are in the interval 
Note that pairs (i,j) and (j,i) are considered to be the same pair.

Input Format:
------------------------------
Two space-separated integers describing the respective values of  n and m.

Output Format:
------------------------------
Print a single integer denoting the number of pairs of twins.

Sample Input1:
-----------------------------
3 13

Sample Output1:
-------------------------------
3

Explanation1:
There are three pairs of twins: (3,5),(5,7) and (7,9).



*/

import java.util.*;
public class FS(A2-Batch)D30P4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count =0;
        for(int i=a;i<=b-2;i++)
        {
            if(prime(i) &&prime(i+2))
                count++;
        }
        System.out.println(count);
    }
        public static boolean prime(int a)
        {
            if(a<=1)
                return false;
            boolean flag = true;
            for(int i=2;i<=Math.sqrt(a);i++)
            {
                if(a%i==0)
                {
                    flag = false;
                    break;
                }
            }
            return flag;
            
        }
        
    }
    
