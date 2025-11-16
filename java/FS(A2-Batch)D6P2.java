/*Eya mother was interested purchase 'k' toys in a shop nearby her house.
In that shop there is a rule that toys should be picked(purchased) in contiguous
manner.
There are several toys arranged in a row, and each toy has an associated price.
She is interested to buy 'k' which have the maximum average value.

Your task is to help Eya's mother in finding 'k' toys with a maximum average
value.

Input:
--------------------
Line:1 Array elements
Line:2 'K' value


Sample Testcase:
--------------------------
Input:
-------------------------
1 12 -5 -6 50 3
4

Output:
------------------------
12.75

Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Sample Testcase:
--------------------------
Input:
-------------------------
5
1

Output:
------------------------
5.0
*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class FS(A2-Batch)D6P2
{
    public static double checkavg(int arr[],double n)
    {
        int wsum =0;
        int msum =0;
            
        for(int i=0;i<=arr.length-n;i++)
        {
            wsum=0;
            for(int j=i;j<i+n;j++)
            {
                wsum+=arr[j];
            }
            msum = Math.max(wsum,msum);
        }
        double avg = msum/n;
        return avg;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String []s = sc.nextLine().split(" ");
        double k = sc.nextInt();
        int arr[] = new int [s.length];
        int p=0;
        for(String s1: s)
        {
            arr[p] = Integer.parseInt(s1);
            p++;
        }
        System.out.print(checkavg(arr,k));
    }
}
