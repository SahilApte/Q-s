Ramu is given a number n(n>0) where he can only do the below mentioned operations 

n is odd, you can replace n with either n + 1 or n - 1 .
n is even, replace n with n/2 .

Ramu has to print the minimum number of replacements needed for n to become 1?

Sample Testcase: 
-------------------------------------
input = 8
output = 3

Explanation:
----------------------------------------
8 -> 4 -> 2 -> 1


Sample Testcase:
---------------------------------------
input=7
output=4

Explanation:
---------------------------------------
7 -> 8 -> 4 -> 2 -> 1
or
7 -> 6 -> 3 -> 2 -> 1

import java.util.*;
public class Prog
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count =0;
        
        while(n!=0)
        {
        if(n%2==0&&n!=0)
        {
            if(n==1)
            {
                break;
            }
            n/=2;
            count++;
        }
        else if(n%2!=0){
            n = n-1;
            count++;
            if(n==1)
            {
                break;
            }
        }
        }
        System.out.println(count-1);
    }
}
