/*
There is a series of bulbs in which some bulbs are turned on(indicated by 1) 
and others are off(indicated by 0).Your task is to find the maximum count of 
all bulbswhich are turned on and which exist in series.
 

Sample TestCase:
-------------------------------------
input
----------------
1,1,0,1,1,1

output
----------------
3

Explanation: The maximum series is 3.


Sample TestCase:
-------------------------------------
input
----------------
1,0,1,1,0,1

output
----------------
2
*/
import java.util.*;
public class FS(A2-Batch)D3P3
{
    // 1,1,0,1,1,1
    //1,0,1,1,0,1
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int co=0;
        int max =0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals("1"))
            {
                co++;
                max =Math.max(co,max);
            }
            else
            {
                co=0;
            }
        }
        System.out.print(max);
}
}
