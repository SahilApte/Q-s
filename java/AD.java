import java.io.*;
import java.util.*;
public class AD
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List <Integer> lst = new ArrayList<Integer>();
        List <Integer> lst1 = new ArrayList<Integer>();
        
        for(int i=0;i<=s.length();i++)
        {
            lst1.add(i);
        }
        if(s.charAt(0)=='D')
        {
            lst.add(Collections.max(lst1));
            lst1.remove(Collections.max(lst1));
            
        }
        else if(s.charAt(0)=='A')
        {
            lst.add(Collections.min(lst1));
            lst1.remove(Collections.min(lst1));   
        }
        for(int i= 0;i<s.length()-1;i++)
        {
        char ch = s.charAt(i);
        char ch1 = s.charAt(i+1);
        
        if((int)ch ==(int)ch1)
        {
            if(ch=='A'){
            lst.add(Collections.min(lst1));
            lst1.remove(Collections.min(lst1));
            }
            else if(ch=='D'){
            lst.add(Collections.max(lst1));
            lst1.remove(Collections.max(lst1));
            }
        }
        else if((int)ch< (int) ch1)
        {
            lst.add(Collections.max(lst1));
            lst1.remove(Collections.max(lst1));      
        }
        else if((int)ch>(int) ch1)
        {
            lst.add(Collections.min(lst1));
            lst1.remove(Collections.min(lst1));
        }
        }
        lst.addAll(lst1);
        System.out.print(lst);
        
    }
}
