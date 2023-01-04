/*Write a Program to print the below pattern without using arrays or any other 
data structure for the given value n.

Input Format:
---------------------------------------
Line:1 Number of Rows as input

Sample Testcase:
----------------------
Input:
---------------------
5
Output:
----------------------
1
2 9
3 8 10
4 7 11 14
5 6 12 13 15
*/

import java.util.*;
public class FS(A2-Batch)D28P1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int r =i;
            for(int j=1;j<=i;j++)
            {
                int eve = 2*(n-i)+1;
                int odd = 2*(i-j+1);
                if(j==1)
                {
                    System.out.print(r+" ");
                }
                else if(j%2==0)
                {
                    r+=eve;
                    System.out.print(r+" ");
                }
                else if(j%2!=0)
                {
                    r+=odd;
                    System.out.print(r+" ");
                }
                //doubt not working 
                // r+= j%2==0?(2*(n-i))+1:(2*(i-j+1));
                // r=(j%2==0?odd:eve)+r;
                // System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}
