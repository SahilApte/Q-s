/*Rahul is checking Onion prices for N number of days.He observed that for any N 
value (N>=3) there is a clear increase followed by decrease in price of Onions.

Given an integer array price[],where price[i] is the price of Onions on ith 
day(0-indexed).
Help rahul return a day where the onions are very costly.

Can u solve in O(log(n)) complexity?
Input Format:
-------------
Line-1: An Integer N represents number of days.
Line-2: N space separated integers represent price on each day..
  
Output Format:
--------------
 Print an index value.
   
Sample Input-1:
 ---------------
5
1 2 3 2 1
  
Sample Output-1:
----------------
2

Explanation:
------------
On Day-2 , tha cost is 3 which is highest among all days.
   
 Sample Input-2:
 ---------------
6
100 150 250 300 280 260
  
 Sample Output-2:
 ----------------
3

Explanation:
------------
On Day-3 , tha cost is 300 which is highest among all days.
*/

import java.util.*;
public class FS(A2-Batch)D26P1
{
    public static int Bs(int arr[])
    {
        int low =0;
        int high = arr.length-1;
        int store = 0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid+1]<arr[mid])
            {
                store = mid;
                // System.out.println(mid);
                break;
            }
            else if(arr[mid-1]<arr[mid]&&arr[mid+1]>arr[mid])
            {
                low = mid+1;
            }
            else if(arr[mid-1]>arr[mid]&&arr[mid+1]<arr[mid])
            {
                high = mid-1;
            }
        }
        return store;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(Bs(arr));
        
    }
}
