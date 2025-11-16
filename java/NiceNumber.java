
Given an array of integers nums and an integer k. A subarray is called 
nice if there are k odd numbers on it.
Return the number of nice sub-arrays.

Sample Testcase:
--------------------------------------------
input =
5
1 1 2 1 1
3
output =
2

Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

Sample Testcase:
--------------------------------------------

input =
3
2 4 6
1
output =
0
Explanation: There is no odd numbers in the array.

input =
10
2 2 2 1 2 2 1 2 2 2
2
output =16


import java.util.*;
public class Prog
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int count =0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]%2!=0)
                {
                    count++;}
                     if(count==k)
                    {
                        sum++;
                        
                    }
                
            }
        }
        System.out.println(sum);
    }
}
