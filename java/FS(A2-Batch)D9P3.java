/*
Given an array of size n, find the majority element. 
The majority element is the element that appears more than [ n/2 ] times.

You may assume that the array is non-empty 
and the majority element always exist in the array.

Example 1:
	Input: 3 2 3
	Output: 3

Example 2:
	Input: 2 2 1 1 1 2 2
	Output: 2
NOTE: if there are two such elements exist print the first one.
*/
import java.util.*;
public class FS(A2-Batch)D9P3
{
    public static int count(int arr[])
    {
        // 2211122
        // 1112222
       int count =0;
       int cad = 0;
       for(int n:arr)
       {
           if(count ==0)
           {
               cad =n;
           }
           if(n==cad)
           {
               count+=1;
           }
           else
           {
               count -=1;
           }
       }
       return cad;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String [] s = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        int p=0;
        for(String i:s)
        {
            arr[p]=Integer.parseInt(i);
            p++;
        }
        System.out.println(count(arr));
        
    }
}
