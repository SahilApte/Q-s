import java.io.*;
import java.util.*;
public class Miss
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String [] s= sc.nextLine().split(" ");
        int size = s.length;
        int arr[]= new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        int start = 0;
        int mid = 0;
        int end = size-1;
        int find = sc.nextInt();
        int index =-13;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid] == find)
            {
                index = mid;
                break;
            }
            else if(arr[mid] < find)
            {
                start = mid +1;
            }
            else
            {
                end = mid-1;
            }
        }
        if(index ==-13)
        {
            System.out.println(start);
        }
        else
        {
            System.out.println(index);
        }
            
        
}
}
