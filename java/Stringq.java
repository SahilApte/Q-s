import java.util.*;
import java.io.*;
import java.lang.*;
public class Stringq{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        // String dum = sc.next();
        String c = sc.next();
        int low= 0,flag =0;
        int high = s.length()-1;
        int mid = 0,index = 0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(s.indexOf(c)>mid || s.indexOf(char((int) c +1))>mid)
            {
                low = mid+1;
            }
            // else if(s.indexOf(c)<mid || s.indexOf(s.charAt((int) c +1))<mid)
            // {
            //     high  = mid-1;
            // }
            else if(s.index(c).equals(mid))
            {
                index = s.index(c);
            }
            else
            {
                flag = 1;
            }
        }
        if(flag == 1)
        {
            System.out.println(s.charAt(1));
        }
    }
}
