import java.io.*;
import java.util.*;
import java.lang.*;
public class Onion{
    public static void main(String ats[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        
        for(int i = 0;i<a;i++)
        {
            arr[i]= sc.nextInt();
        }
        int mid = 0;
        int low = 1;
        int high = arr.length -2;
        
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid])
            {
                System.out.println(mid);
                break;
            }
            else if (arr[mid-1]<arr[mid] && arr[mid+1]>arr[mid])
            {
                low =mid+1;
            }
            else if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid])
            {
                high = mid-1;
            }
        }
    }
}
