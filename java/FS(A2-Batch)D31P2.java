/*Sophie is a software developer who was given a task to write an efficient 
program that could identify and count all the duplicates in a given string. 

Help Sopie to find the above.If duplicates exsists print the frequency of each
otherwise print -1.

Sample TestCase:
--------------------------
input=helword
output=-1

Sample TestCase:
--------------------------
input=aabbcc
output=a:2
b:2
c:2
*/
import java.util.*;
public class FS(A2-Batch)D31P2
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        // String[]s = sc.nextLine().split(" ");
        String s = sc.nextLine().toLowerCase();
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm1 = new HashMap<>();
        int cnt =1;
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),1);
            }
            else
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
      for(char c : hm.keySet())
      {
           if(hm.get(c)>1)
           {
              hm1.put(c,hm.get(c));
            //   System.out.println(c,hm.get(c);
           }
       }
       if(hm1.size()==0)
       {
           System.out.println("-1");
           
       }
      else
      {
          System.out.println(hm1);
      }
    }
}
