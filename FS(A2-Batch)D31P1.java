/*Once upon a time, there was a young programmer named Sarah who was working on a
challenging problem involving an m x n integer matrix. The matrix had two 
properties: each row was sorted in non-decreasing order, and the first integer
of each row was greater than the last integer of the previous row.

Sarah was given the task of writing a program that would determine if a given
integer target was present in the matrix or not.

If integer is present she should return true otherwise false.

Input Format:
-----------------------------
Line-1: Size of matrix
Line-2: Matrix elements followed by target element

Sample Testcase:
-------------------------
input=3 4
1 3 5 7
10 11 16 20
23 30 34 50
13
output=false

Sample Testcase:
-------------------------
input=4 1
1 
10
23
16
output=false*/
import java.util.*;
public class FS(A2-Batch)D31P1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[]= new int[r*c];
        for(int i=0;i<r*c;i++)
        {
          arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int t = sc.nextInt();
        System.out.println(bs(arr,t));
    }
    public static boolean bs(int arr[],int t)
    {
        int high =arr.length-1;
        int low =0;
        // int mid =0;
        boolean flag = false;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==t)
            {
                return true;
            }
            if(t>arr[mid])
            {
                low =mid+1;
            }
            if(t<arr[mid])
            {
                high = mid-1;
            }
        }
        return false;
    }
}
