
Sorting is useful as the first step in many different tasks. 
The most common task is to make finding things easier, 
but there are other uses as well. In this case, 
it will make it easier to determine which pair or 
pairs of elements have the smallest absolute difference between them.

For example, if you've got the list [5,2,3,4,1], 
sort it as [1,2,3,4,5] to see that several pairs have the minimum difference
of 1:[(1,2),(2,3),(3,4),(4,5)] . 
The return array would be [1,2,2,3,3,4,4,5].

Given a list of unsorted integers,arr, 
find the pair of elements that have the smallest absolute difference between them. 
If there are multiple pairs, find them all.

Input Format
------------
The first line contains a single integer n, the length of arr.
The second line contains n space-separated integers, arr[i].

Output Format
-------------
Output the pairs of elements with the smallest difference. 
If there are multiple pairs, output all of them in ascending order, 
all on the same line with just a single space between each pair of numbers. 
A number may be part of two pairs when paired with its predecessor and its successor.


input = 5
5 2 3 4 1
output =
1 2 2 3 3 4 4 5

input =
4
5 4 3 2
output =.
2 3 3 4 4 5

Explanation 2
--------------
Here, the minimum difference will be 1. 
Valid pairs are (2, 3), (3, 4), and (4, 5). 
We print the elements of each pair, space-separated on a single line.

input =
12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 
output =
-520 -470 -20 30

Explanation 1
--------------
(-470) - (-520) = 50 - (-20) = 50, which is the smallest difference.

import java.util.*;
public class File
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        ArrayList<Integer>lst =new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])<min)min = Math.abs(arr[i]-arr[i+1]);
        }
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])==min)
            {
                lst.add(arr[i]);
                lst.add(arr[i+1]);
            }
        }
        System.out.println(lst);
    }
}
