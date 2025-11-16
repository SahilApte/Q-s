/*Harsha a second class student is playing a game on his tab. 
where he has go to second level. He can reach second level if and only 
if he solves the first level. 

In the first level he will be a given a number series which will contain 
only '1' and '0's. 

He has to replace '0' to '1' and '1' to '0' and add '1' at the
end and produce a new result. 

If he is able to produce a new result he can reach the second level. 
Help him to reach the second level. 


Examples:

 "0111" is "1000" and adding 1 at the end we get 1001
 "1100" is  "0011" and adding 1 at the end we get 0100

Here adding will done from the last 
when we add two '1's  we get 10 as the result and 1 is carry forwarded,
on continuing the same process we get 0100 as the result 


Sample Test Case
--------------------------
input
----------------
0111

1000
0001
1001
output
----------------
1001

Sample Test Case 
----------------------------
input
----------
1100

0011
0001
0100
output
----------
0100
*/
import java.util.*;
public class FS(A2-Batch)D16P2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a  = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='1')
            {
                sb.append(0);
            }
            else if(a.charAt(i)=='0')
            {
                sb.append(1);
            }
        }
        String b = sb.toString();
        int res = Integer.parseInt(b,2);
        res++;
        String fin = Integer.toBinaryString(res);
        if(fin.length()!=a.length())
        {
            System.out.print(0+fin);
            System.exit(0);
        }
        System.out.print(fin);
        
    }
}
