/*Given an array arr[] denoting heights of N towers and a positive integer K,
you have to modify  the height of each tower either by increasing or decreasing
them by K only once.After modifying, height should be a non-negative integer.
Find out what could be the possible minimum difference of the height of 
shortest and longest towers after you have modified each tower.

Input Format:
------------------------
Line-1: K value followed by size of array.
Line-2: Array elements

Sample Testcase:
------------------ ----
input=2 4
1 5 8 10
output=5

Explanation:
-----------------------
The array can be modified as {3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.


Sample Testcase:
----------------------
input=3 5
3 9 12 16 20
output=11

Explanation:
-----------------------
The array can be modified as {6, 12, 9, 13, 17}. The difference between 
the largest and the smallest is 17-6 = 11.*/

import java.util.*;
public class FS(A2-Batch)D33P3
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        ArrayList <Integer> lst = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            lst.add(sc.nextInt());
        }
        int max = Collections.max(lst);
        int min = Collections.min(lst);
        max = max-k;
        min = min+k;
        System.out.println((int)(max-min));
        
    }
}
