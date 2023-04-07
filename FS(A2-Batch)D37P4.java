write a program to print the following pattern
        *
      * + *
    * + + + *
  * + + + + + *
* * * * * * * * *
import java.util.*;
public class Hi
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt()-1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(j<n-i) System.out.print("  ");
                else if(j==n-i) System.out.print("* ");
                else System.out.print("+ ");
                
            }
            if(i>0)
            {
                for(int j=1;j<=n;j++)
                {
                    if(j==i)
                    {
                        System.out.print("* ");
                        break;
                    }
                    else System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}
