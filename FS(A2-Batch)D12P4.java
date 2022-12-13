/*Larry has been given a permutation of a sequence of natural numbers 
incrementing from 1 as an array. He must determine whether
the array can be sorted using the following operation any number of times:
-Choose any 3 consecutive indices and rotate their elements in 
such a way that ABC->BCA->CAB->ABC.

For example, if A={1,6,5,2,4,3}:

A				rotate 
[1,6,5,2,4,3]		[6,5,2]
[1,5,2,6,4,3]		[5,2,6]
[1,2,6,5,4,3]		[5,4,3]
[1,2,6,3,5,4]		[6,3,5]
[1,2,3,5,6,4]		[5,6,4]
[1,2,3,4,5,6]
YES

Input Format:
The first line contains an integer n, the length of A.
The next line contains n space-separated integers .

Constraints:
3<=n<=1000
1<=A[i]<=n
 
Output Format:
print YES if A can be fully sorted. Otherwise, print NO.

Sample Input1:
3
3 1 2
Sample Output1:
YES

Sample Input2:
5
1 2 3 5 4
Sample Output2:
NO

Explanation
Sample #1:
A=[3,1,2]->rotate->[3,1,2]->A=[1,2,3] 123 231 312
A is now sorted, so we print YES.

Sample #2:
No sequence of rotations will result in a sorted . Thus, we print NO.*/

import java.util.*;
public class FS(A2-Batch)D12P4
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int temp = 0;
        int count =0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(arr[i]>arr[j])
            {
                count++;
            }
            }
        }
        String res = count%2==0? "YES":"NO";
        System.out.print(res);
    }
}
