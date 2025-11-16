import java.io.*;
import java.util.*;
public class Switches
{
    public static void main(String arg[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
     for(int i =0;i<n;i++)
     {
          if(i==0)
        {
             if(arr[i]==0 && arr[i+1]==0)
             {
                 count ++;
                 arr[i]=1;
             }
          } 
          
         else if(i<n-2)
         {
            if(arr[i]==0 && arr[i-1]==0 && arr[i+1]==0)
            {
                count +=1;
                arr[i]=1;
            }
         }
        else if(i==n-1)
            {
                if(arr[n-2]==0 && arr[i]==0)
                {
                    count+=1;
                    arr[i]=1;
                }
            }
        }
        if(count >= k){
            System.out.print(true);}
        else{
            System.out.print(false);
        }
        }
    }
