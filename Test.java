import java.util.*;
import java.lang.*;
import java.io.*;
public class Test
{
    public static void main(String args[])
    {
        int i =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        String s5 = sc.nextLine();
        String s = sc.nextLine();
        String[] sarr1 = s.split(" ");
        for(String q:sarr1)
        {
            arr1[i] = Integer.parseInt(q);
            i++;
        }
        String s2 = sc.nextLine();
        String[] sarr2 = s2.split(" ");
        i = 0;
        for(String c:sarr2)
        {
            arr2[i] = Integer.parseInt(c);
            i++;
        }
        for(int j =0;j<n;j++)
        {
            for(int k = 0;k<n;k++)
            {
                if(arr1[j]==arr2[k])
                {
                    System.out.print(k+ " ");
                    arr2[k]=-2;
                    break;
                }
            }
        }
    }
}
