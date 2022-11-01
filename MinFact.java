import java.io.*;
import java.util.*;
class MinFact
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        List <Integer> lst= new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
                if(n%i == 0)
                {   
                    lst.add(i);
                }
        }
        int s = lst.size();
        int n1 = lst.get(s/2);
        int n2 = lst.get((s-1)/2);
        
        System.out.println(n1+ " "+n2);
        // System.out.println(lst);
        
    }
}
