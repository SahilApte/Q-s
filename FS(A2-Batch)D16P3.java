/*/*Write a Java program to print followint pattern 

input=6
output=
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 


*/

import java.util.*;
public class FS(A2-Batch)D16P3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p+" ");
                p++;
            }
            p=1;
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(p+" ");
                p++;
            }
            p=1;
            System.out.println();
        }
     
        
    }
}
