import java.io.*;
import java.util.*;
class OneCounter
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
##### method 2
import java.io.*;
import java.util.*;

class P3{
    static int oneCounter(int n){
        int count = 0;
        while(n > 0){
            if(n % 2 == 1){
                count += 1;
            }
            n /= 2;
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.print(oneCounter(i) + " ");
        }
    }
}
