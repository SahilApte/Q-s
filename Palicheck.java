import java.io.*;
import java.util.*;
public class Palicheck
{
public static boolean ispa(String s)
{
   for(int i = 0;i<s.length()/2;i++)
   {
       if(s.charAt(i)!=s.charAt(s.length()-i-1))
            return false;
   }
        return true;
}
public static boolean check(String s)
{
    if(ispa(s))
    {
        return true;
    }
    for(int i = 0;i<s.length();i++)
    {
        String s2 = s;
        StringBuilder sb = new StringBuilder(s2);
        sb.deleteCharAt(i);
        s2 = sb.toString();
        if(ispa(s2))
            return true;
    }
    return false;
 
}
public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String m = sc.nextLine();
        
        if(check(m) == true)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
