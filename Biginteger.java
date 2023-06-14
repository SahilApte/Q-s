
The factorial of the integer n, written n!, is defined as
n!=n*(n-1)*(n-2)*(n-3)*......1

calculate and print the factorial of a given positive integer.
Note: for other boundary conditions print -1.
for example:
if n=30 we calculate 30*29*28*....3*2*1=265252859812191058636308480000000.

input =
30
output =
265252859812191058636308480000000


input =
25
output =
15511210043330985984000000

import java.util.*;
import java.math.*;
public class File
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
        if(n<0)
        {
            System.out.println(-1);
            return;
        }
        BigInteger pro = new BigInteger("1");
        for(long i =n;i>0;i--)
        {
            pro=pro.multiply(BigInteger.valueOf(i));
            // System.out.println(pro);
        }
        System.out.println(pro);
    }
}
