import java.io.*;
import java.util.*;
public class Pascal
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        Integer []ar = new Integer[a+1];
        ar[0] = 1;
        for(int i = 0;i<=a ;i++)
        {
            ar[i] = 1;
                for(int j=i-1;j>0;j--)
                {
                    ar[j] = ar[j-1]+ar[j];
                }
        }
        System.out.println(Arrays.asList(ar));
        
    }
}
