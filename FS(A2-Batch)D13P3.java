/*Write a java program to print the following pattern
 
 
Sample TestCase
--------------------------
input:
--------------------
5


output
-------------
*
* *
* * *
* * * *
* * * * *



*/
import java.util.*;
public class Test
{
    static String Pattern(int n,int i)
    {
        if(i>n)
        {
            return "";
            
        }
        else
        {
            System.out.println("*".repeat(i));
            return Pattern(n,++i);
        }
    }

    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        Pattern(n,i);
    }
}
