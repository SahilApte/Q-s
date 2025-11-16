import java.io.*;
import java.util.*;
public class Double
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String [] s = sc.nextLine().split(" ");
        int size = s.length;
        int arr[]= new int[size];
        boolean found = false;
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        int mid = 0;
        int target = 0;
        int store = 0;
        // System.out.println(arr[2]);
        for(int i=0;i<size;i++)
        {
        int start = 0;
        int end = size -1;
        int ans=arr[i]*2;
        while(start<=end)
        {
            
                mid = start + (end-start/2);
                if(ans== arr[mid])
                {
                    found = true;
                    break;
                }
                else if(ans > arr[mid])
                {
                    start  = mid +1;
                }
                else
                {
                    end = mid -1;
                }
            }
        }
        
        System.out.println(found);
    }
}
