/*Check ith bit is set or not set in the binary form of the given number 

Note:  Use only Bit Manipulation


Sample Testcase:
-------------------------
input:
----------------
20
2
output:
---------------------------------------
true
*/

import java.util.*;
public class FS(A2-Batch)D19P3
{
    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean max = (((a>>b)&1)>0)?true:false;
        System.out.println(max);
        // if(((a>>b)&1)>0)
        // {
        //     System.out.println(true);
        // }
        // else
        // {
        // System.out.println(false);}
    }
}
