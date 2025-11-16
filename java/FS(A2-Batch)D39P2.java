Write a Program to print the following pattern for any given positive integer n 


input = 5
output =
5432*
543*1
54*21
5*321
*4321 
  
import java.util.*;
public class Patter
{
    public static void main(String ar[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k = n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==k)
                {
                    System.out.print("*");
                    continue;
                }
                System.out.print(n-j);
            }
            System.out.println();
            k--;
        }
    }
}
