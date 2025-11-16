/*Given an array of integers nums, write a method that returns the "pivot" 
index of this array.

We define the pivot index as the index where the sum of the numbers to 
the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot 
indexes, you should return the left-most pivot index.

Example 1:

Input:1 7 3 6 5 6
Output: 3

Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the
sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
 

Input: 1 2 3
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
 

Note:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].

*/
import java.util.*;
public class Proh
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split(" ");
        int pivot=-1;
        int prifix[]=new int[s.length];
        int arr[]=new int[s.length];
        int p=0;
        for(String s1:s)
        {
            arr[p]=Integer.valueOf(s[p]);
            p++;
        }
        prifix[0]=arr[0];
        for(int i=1;i<s.length;i++){
            prifix[i]=prifix[i-1]+arr[i];
        }
        for(int i=s.length-2;i>=0;i--)
        {
            arr[i]=arr[i]+arr[i+1];
        }
        for(int i=0;i<s.length;i++)
        {
            if(prifix[i]==arr[i])
            {
                pivot=i;
                break;
            }
        }
        System.out.println(pivot);
    }
    
    
}
