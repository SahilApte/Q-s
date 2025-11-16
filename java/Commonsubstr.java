import java.io.*;
import java.util.*;
public class Commonsubstr{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder("");

        Arrays.sort(a);
   
        String s1 = a[0];
        String s2 = a[a.length-1];
        int min;
        if(s1.length()>s2.length())
            min = s2.length();
        else
            min=s1.length();
        for(int i = 0;i<min;i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
                break;
            sb.append(s1.charAt(i));
        }
        System.out.println(sb);
    }
}
