/*Given an initial array arr, every day you produce a new array using the 
array of the previous day.

On the i-th day, you do the following operations on the array of
day i-1 to produce the array of day i:

If an element is smaller than both its left neighbor and its right neighbor, 
then this element is incremented.
If an element is bigger than both its left neighbor and its right neighbor, 
then this element is decremented.
The first and last elements never change.


After some days, the array does not change. Return that final array.

input =4
6 2 3 4
output =6 3 3 4

Explanation: 
On the first day, the array is changed from [6,2,3,4] to [6,3,3,4].
No more operations can be done to this array.


input =6
1 6 3 4 3 5
output =1 4 4 4 4 5
1 5 4 4 4 5
1 4 4 4 4 5
3
1 2 1
1 1 1

6
1 2 2 2 2 1
1 2 2 2 2 1
Explanation: 
On the first day, the array is changed from [1,6,3,4,3,5] to [1,5,4,3,4,5].
On the second day, the array is changed from [1,5,4,3,4,5] to [1,4,4,4,4,5].
No more operations can be done to this array.
 

import java.util.*;
public class Files
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        boolean ch = true;
        while(ch)
        {
            ch = false;
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]<arr[i+1]&&arr[i]<arr[i-1])
            {
                arr[i]=arr[i]+1;
                ch = true;
            }
            else if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
            {
                arr[i]=arr[i]-1;
                ch = true;
            }
        }
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
        
}
