import java.io.*;
import java.util.*;
import java.lang.*;
class ChhotaBheem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int laddu = n/2;
        int arr[] = new int[n];
        Set <Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        System.out.print(Math.min(set.size(),laddu));
        
    }
}
