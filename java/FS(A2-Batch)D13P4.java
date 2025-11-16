/*Given integer 'N' print maximum possible value
obtainable by deleting one "5" digit from the decimal 
representation of N.It is guaranteed that N will contain
atlease one'5' digit.

Example:

1.Given N=15958 should print 1958.
2.Given N=-5859, print -589.
3.Given N=-5000,print 0,After deleting the '5' the 
only digits in the number are zeros,so its value is 0.

Note: N contains atleast one '5' digit in its decimal
representation

N consists of atleast two digits in its decimal representation.


Sample TestCase:
--------------------------
input
-------
15958

ouput:
-----------
1958

-59156
-9156
-5916*/
import java.util.*;
import java.lang.*;

public class FS(A2-Batch)D13P4.java
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n.length()-1;i++)
        {
            if(n.charAt(i)=='5')
            {
                StringBuilder sb = new StringBuilder(n);
                sb.deleteCharAt(i);
                max = Math.max(max,Integer.parseInt(sb.toString()));
            }
        }
        System.out.println(max);
    }
}
