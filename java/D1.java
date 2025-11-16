import java.io.*;
import java.util.*;
public class D1
{
    public static void main(String[] args)
    {
        
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int flag = 0;
        int arr[]=new int[a];
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i<a;i++)
        {
            arr[i]=sc.nextInt();
            hs.add(arr[i]);
        }
            if(arr.length ==hs.size())
                System.out.println("false");
            else
                System.out.println("true");
    }
    
}
