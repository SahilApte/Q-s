Given an array of elements of size, find the sum of the sums of all possible subsets.

forexample:

input =
2
3 7
output =
20


The subsets are: {3} {7} {3, 7}
{3, 7} = 10
{3} = 3
{7} = 7
10 + 3 + 7 = 20 so print 2o


import java.util.*;
public class Subs{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i] = sc.nextInt();
        int sum =0;
        for(int i=0;i<n;i++)sum+=arr[i]*Math.pow(2,n-1);
        System.out.println(sum);
    }
}
