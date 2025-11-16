/*Arun is given a set of integers SOI[], consists of both +ve and -ve integers.
Arun wants to find the maximum sum of contiguous subset of the SOI, with a twist.

You have to perform the following operation before finding the maximum sum:
- You are allowed to replace exactly one integer X, with its square value (X*X).

Can you please help Arun to find out the maximum sum of contiguous subset.


Input Format:
-------------
Single line of space separated integers, values of the array.

Output Format:
--------------
Print an integer value as result.


Sample Input-1:
---------------
-5 -3 1 2 -3 4 -4 3

Sample Output-1:
----------------
26

Explanation:
------------
max sum is: (-5)^2 + (-3) + 1 + 2 + (-3) + 4 = 26


Sample Input-2:
---------------
2 -2 2 2 -2 -2 2

Sample Output-2:
----------------
10

Explanation:
------------
max sum is: 2 +(-2)^2 + 2 + 2 = 10

*/

import java.util.*;
public class FS(A2-Batch)D24P2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String [] s = sc.nextLine().split(" ");
        ArrayList<Integer> lst = new ArrayList<>();
        int arr[] = new int[s.length];
        int p=0;
        int maxx =0;
        int msum =Integer.MIN_VALUE;
        ArrayList<Integer> lst1 = new ArrayList<>();
        for(String s1:s)
        {
            arr[p] = Integer.parseInt(s1);
            p++;
        }
        for(int j=0;j<arr.length;j++)
        {
            int temp = arr[j];
            arr[j] = arr[j]*arr[j];
            int summ =0;
            for(int k=0;k<arr.length;k++)
            {
                summ = summ +arr[k];
                maxx = Math.max(maxx,summ);
                if(summ<0)summ=0;
                
            }
                arr[j] = temp;
        }
        
        System.out.println(maxx);
    }
}
