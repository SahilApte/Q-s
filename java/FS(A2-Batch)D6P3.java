/*Rishka got string which contains beads of two colors red and green as 
a birthday present (what a surprise!).
Rishka doesn't like this present and she wants to change the string of 
beads in such a way that she want to perform clustering


Your task it to help Rishka to cluster beads with minimum number of changes.

Red:0
Green:1


Sample TestCase:
--------------------------------
Input:
1 0 1 0 1

Output:
---------------------------------
1

Explanation: There are 3 ways to group all 1's together:
[1,1,1,0,0] using 1 swap.
[0,1,1,1,0] using 2 swaps.
[0,0,1,1,1] using 1 swap.
The minimum is 1.



Sample TestCase:
--------------------------------
Input:
0 0 0 1 0

Output:
-------------------------------
0

Explanation: Since there is only one 1 in the array, no swaps are needed.


Sample TestCase:
--------------------------------
Input:
1 0 1 0 1 0 0 1 1 0 1

Output: 
--------------------------------
3

Explanation: One possible solution that uses 3 swaps is [0,0,0,0,0,1,1,1,1,1,1].*/
import java.util.*;
public class FS(A2-Batch)D6P3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        // ArrayList<Integer> lst = new ArrayList<>(s.length);
        int arr[] = new int[s.length];
        int p=0;
        for(String s1: s)
        {
            arr[p] = Integer.parseInt(s1);
            p++;
        }
        int onec = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == 1)
            {
                onec++;
            }
        }
        int wsum =0;
        int msum =0;
        for(int i =0;i<=arr.length-onec;i++)
        {
            wsum =0;
            for(int j=i;j<i+onec;j++)
            {
                wsum+=arr[j];
            }
            msum = Math.max(wsum,msum);
        }
        System.out.print(onec-msum);
        
    }
}
