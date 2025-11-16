import java.io.*;
import java.util.*;
public class Evenodd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            if(num%2==0)
            {
                System.out.print(num+" ");
            }
            else
            {
                arr.add(num);
            }
        }
        for(int i = 0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}
