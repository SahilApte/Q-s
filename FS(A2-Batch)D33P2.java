/*Once upon a time, there was a software developer named John who was 
working on an algorithm to find the row with the maximum number of 1s
in a boolean 2D array where each row was sorted.

John had a rectangular boolean 2D array of size M x N, where 
each row was sorted in non-decreasing order. He needed to find 
the row that had the maximum number of 1s in the array.

Input Format:
---------------------------------
Line-1:Size of 2D array
Line-2: 2D array elements

Sample TestCase:
-------------------------------------
Input matrix :4 4
               0 1 1 1
               0 0 1 1
               1 1 1 1  // this row has maximum 1s
               0 0 0 0
Output: 2*/

import java.util.*;
public class FS(A2-Batch)D33P2
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        int cnt =0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            cnt = 0;
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==1)
                {
                    cnt++;
                }
            }
            lst.add(cnt);
        }
        int max = Collections.max(lst);
        int index = lst.indexOf(max);
        System.out.println(index);   
    }
}
