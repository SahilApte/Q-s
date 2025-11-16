/*Given an array write recursive function to sum of fibonacci numbers

Sample Testcase

input:
----------------
3

output:
-----------------
2*/
import java.util.*;
public class FS(A2-Batch)D12P3
{
    public static int feb(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return feb(n-1)+feb(n-2);
        }
        // return n;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(feb(n));
    }
}
