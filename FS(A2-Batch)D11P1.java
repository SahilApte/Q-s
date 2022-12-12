/*There are two friends "Ram" and "Sam". You have n chocolates.
You want to distribute these n chocolates between two friends
in such a way that Ram will get i chocolates, Sam will get
j chocolates.Ram will get greater amount of candies than "Sam"
But all the chocolates should be distributed.
Yours task is to find the number of ways to distribute n chocolates
between two friends. 



Sample TestCase:
------------------------------
Input:
----------
7

output:
-------------
3


Explanation:
-----------

i=5,j=2
i=4,j=3
j=6,j=1

Total 3 ways

Sample TestCase:
------------------------------
Input:
----------
1

output:
-------------
0


*/

import java.util.*;
public class FS(A2-Batch)D11P1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int summ=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                summ =i+j;
                if(summ==n){
                    count++;
                }
            }
        }
            System.out.println(count/2);
        }
}
