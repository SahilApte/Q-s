import java.io.*;
import java.util.*;
public class Bicycle
{
    public static int bs(int arr[],int n)
    {
        int store = Integer.MAX_VALUE;
        int start = 0;
        int end = n-1;
        
        while(start<=end)
        {
        
            int mid = start + (end-start)/2;
            
            if(arr[mid]==mid && mid<store)
            {
                store = mid;
                end = mid -1;
            }
            else if(arr[mid] < mid)
            {
                start = mid +1;
            }
            else if(arr[mid] > mid)
            {
                end = mid -1;
            }
        }
        if(store == Integer.MAX_VALUE)
        {
        return -1;}
        else
        {
            return store;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int arr[] = new int[a];
       for(int i=0;i<a;i++)
       {
            arr[i] = sc.nextInt();
       }
       System.out.println(bs(arr,a));
     
        
    }
}
