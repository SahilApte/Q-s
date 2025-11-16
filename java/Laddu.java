import java.io.*;
import java.util.*;
public class Laddu{
    public static List<String> ls = new ArrayList<>();
    public static String check(int [] eaten, int s,int e)
    {
        if(eaten[0]!=s)
        {
            int end = eaten[0]-1;
            add(s,end);
        }
        for(int i=1;i<eaten.length;i++)
        {
            if(eaten[i]-eaten[i-1]!=1)
            {
                add(eaten[i-1]+1,eaten[i]-1);
            }
        }
        if(eaten[eaten.length-1]!=e)
        {
            int start = eaten[eaten.length-1]+1;
            add(start,e);
        }
        return ls.toString();
    }
    public static void add(int s,int e)
    {
        if(s==e){
            ls.add(""+s);}
        else{
            ls.add(s+":"+e);}
    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int [] arr = new int[k];
        for(int i = 0;i<k;i++)
        {
            arr[i] = sc.nextInt();
        }
        String l = check(arr,s,e);
        System.out.println(l);
        }
    }
