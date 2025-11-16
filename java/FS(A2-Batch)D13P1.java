/*Write a java program to convert decimal to binary using recursion
 
 
Sample TestCase
--------------------------
input:
--------------------
54
        256 128 64 32 16 8 4 2 1 
                    1 1  0 1 1 0
output
-------------
110110



*/
import java.util.*;
public class FS(A2-Batch)D13P1
{
    public static String Tobin(int n)
    {
        int a;
        if(n>0)
        {
            a = n%2;
            return (Tobin(n/2)+""+a);
        }
        return "";
    }

        // return bin;
        
        // ArrayList <Integer> bin = new ArrayList<>();
        // while(n>0)
        // {
        //     int ele = n%2;
        //     bin.add(ele);
        //     n=n/2;
        // }
        // for(int i=bin.size()-1;i>=0;i--)
        // {
        //     System.out.print(bin.get(i));
        // }
    // }
    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Tobin(n));
    }
}
