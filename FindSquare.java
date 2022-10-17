import java.util.*;
import java.lang.*;
public class FindSquare{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long mid=0;
        long n = sc.nextLong();
        long l = 0;
        long h = n/2;
        boolean z = false;
        while(l<=h)
        {
            mid = l+(h-l)/2;
            if(mid*mid == n)
            {
                z = true;
                break;
            }
            else if(mid*mid<n)
            {
                l = l+1;
            }
            else if(mid*mid>n)
            {
                h-=1;
            }
        }
        if(z==true)
            System.out.println(z);
        else
            System.out.println(z);
        
    }
}
