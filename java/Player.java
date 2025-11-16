import java.util.*;

class Player
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=arr[i]=sc.nextInt();
        }
        while(true)
        {
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                arr1[i]=arr[i]-1;
            }
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1])
            {
                arr1[i]=arr[i]+1;
            }
        }
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr1[i])
            {
                flag=false;
            }
        }
        if(!flag)
        {
            arr=arr1.clone();
        }
        else
        {
            break;
        }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
