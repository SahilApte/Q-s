/**/
import java.util.*;
public class Prog
{
    public static void main(String ar[])
    {
    Scanner sc = new Scanner(System.in);
    String [] s = sc.nextLine().split(" ");
    int arr[] = new int[s.length];
    int p=0;
    for(String s1:s)
    {
        arr[p] =Integer.parseInt(s1);
        p++;
    }
    for(int i=0;i<(1<<s.length);i++)
    {
        System.out.print('[');
        int m=1;
        for(int j=0;j<s.length;j++)
        {
            if((i&m)>0)
            {
                System.out.print(arr[j]+" ");
            }
            m=m<<1;
        }
        System.out.print(']');
        
    }
        
    }
}
import java.util.*;
public class Test
{
    public static void subsets(int arr[],int i)
    {
        int n = arr.length;
        if(i>=(1<<n))
        {
            return;
        }
        else
        {
        System.out.print("[");
        int m =1;
        for(int j=0;j<i;j++)
        {
        if((i&m)>0)
        {
            System.out.print(arr[j]+" ");
        }
        m = m<<1;
        }
        System.out.print("]");
        subsets(arr,++i);
        }
    }
    public static void main(String argsp[])
    {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        int p=0;
        for(String s1:s)
        {
            arr[p]=Integer.parseInt(s1);
            p++;
        }
        int i=0;
        int m=1;
        subsets(arr,i);
        
    }
}
