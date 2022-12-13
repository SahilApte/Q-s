/*Given an array write recursive function to find factorial of a number

Sample Testcase

input:
----------------
4

output:
-----------------
24*/
import java.util.*;
public class Factorial
{
    public static int fact(int num)
    {
        if(num<=1)
        {
            return num;
        }
        return num*fact(num-1);
        // if(num>0)
        // {
        //     return num*fact(num-1);
        // }
        // return num;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
