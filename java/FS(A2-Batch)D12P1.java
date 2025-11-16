/*Given an array write recursive function to sum all the previous number to 
each index in an array.

Sample Testcase

input:
----------------
1 2 3 4 5 6 7

output:
-----------------
1 3 6 10 15 21 28*/
import java.util.*;
public class FS(A2-Batch)D12P1
{
    public static int Sumch(int arr[],int summ,int i)
    {
        try{
        int n = arr.length;
        if(arr[i]!=n+1)
        {
            summ = summ+arr[i];
            System.out.print(summ+" ");
            i++;
            Sumch(arr,summ,i);
        }}
        catch(Exception e)
        {
            System.out.println();
            System.exit(0);
        }
        return summ;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String [] s = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        int p=0;
        int summ =0;
        for(String s1: s)
        {
            arr[p]=Integer.parseInt(s1);
            p++;
        }
        int i=0;
        System.out.println(Sumch(arr,summ,i));
    }
}
