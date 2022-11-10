import java.util.*;

class RoundLock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int c=sc.nextInt();
        int[] arr=new int[l];
        int[] arr1=new int[2*l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[l];
        if(c==0)
        {
            for(int i=0;i<l;i++)
            {
                arr2[i]=0;
            }
        }
        int sum=0;
        int p=0,y=0;
        while(p!=(2*l)-1)
        {
            arr1[p]=arr[y];
            if(y!=l-1)
            {
                y++;
            }
            else
            {
                y=0;
            }
            p++;
        }
        if(c>0)
        {
            for(int i=0;i<l;i++)
            {
                for(int j=i+1;j<i+c+1;j++)
                {
                    sum+=arr1[j];
                }
                arr2[i]=sum;
                sum=0;
            }
        }
        if(c<0)
        {
            for(int i=0;i<l;i++)
            {
                for(int j=i+l+c;j<i+l;j++)
                {
                    sum+=arr1[j];
                }
                arr2[i]=sum;
                sum=0;
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        
        
        
    }
}
