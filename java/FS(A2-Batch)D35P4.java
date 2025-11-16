 Given a list of words (without duplicates), please write a program that returns
 all concatenated words in the given list of words.
A concatenated word is defined as a string that is comprised entirely of at
least two shorter words in the given array.

Sample Testcase:
---------------------------------------
input=["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat",
"ratcatdogcat"]
output=["catsdogcats","dogcatsdog","ratcatdogcat"]

Explanation:
---------------------------------------
"catsdogcats" can be concatenated by "cats", "dog" and "cats"; 
 "dogcatsdog" can be concatenated by "dog", "cats" and "dog"; 
"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
  
  import java.util.*;
public class h1
{
    static HashSet<String>hs=new HashSet<String>();
    public static void main(String args[])
    {
        h1 obj=new h1();
        Scanner sc=new Scanner(System.in);
       String s[]=sc.nextLine().split(" ");
       Arrays.sort(s);
      
       ArrayList<String>a=new ArrayList<String>();
       for(int i=0;i<s.length;i++)
      { 
          hs.add(s[i]);
      }
       for(String w:s)
       {
           if(obj.isContains(w))
           {
               a.add(w);
           }
       }
       System.out.println(a);
       
    }
    public boolean isContains(String w)
    {
        int l=w.length();
        for(int i=1;i<l;i++)
        {
            String suffix=w.substring(i);
            if(hs.contains(w.substring(0,i))&&(hs.contains(suffix)||isContains(suffix)))
            {
                return true;
            }
            
        }
        return false;
    }
        
}
