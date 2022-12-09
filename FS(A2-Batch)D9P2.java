/*You are working in Bajaj electronics as the Christmas sale is on you want
to do more sales for hp laptops as the company offered more incentives.
The company has sent laptops in separate cotton boxes with numbers on 
each[1,2,....,n].
Unfortunately, a few boxes are damaged and you want to find out 
the first damaged box.
You are given a bool quality_check(boxnumber)function which returns 
the damaged box.

Try to implement it in O(log n)


Sample TestCase:
---------------------
Input:
-------------
5
4
output:
--------------
4

Explanation:Input line-1 number of boxes,line-2 damaged box.quality_check(3)
returns false,quality_check(4) returns true

 
Sample TestCase:
---------------------
Input:
-------------
1
1
output:
--------------
1
*/
import java.util.*;
public class FS(A2-Batch)D9P2
{
    public static int quality_check(int arr[],int n)
    {
        int start =0;
        int end = arr.length-1;
        int store =0;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            // int mid = (start+end)/2;
            if(arr[mid]==n)
            {
                store = arr[mid];
                break;
            }
            else if(arr[mid]<n)
            {
                start= mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return store;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i] = i+1;
        }
        // System.out.print(arr[4]);
        if(arr.length ==1)
        {
            System.out.print(arr[0]);
        }
        else{
        System.out.print(quality_check(arr,n));}
    }
}
