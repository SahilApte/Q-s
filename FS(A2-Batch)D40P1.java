write a java program to read a sentence from the user and print most frequent 
word from sentence if more than one word repeating same number of times
print the words in the order which they occur.

note: treat small case letters and capital letter case are equal.
output always in lowercase only.ignore extra special characters.

Sample Testcase:
-----------------------------------
input =You cannot end a sentence with because because because is a conjunction
output =because

Sample Testcase:
-----------------------------------
input =i am what i am
output=i am

import java.util.*;
import java.io.*;
import java.util.Map.*;
public class Hashss
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            if(!hm.containsKey(s[i]))
            {
                hm.put(s[i],1);
            }
            else
            {
                hm.put(s[i],hm.get(s[i])+1);
            }
        }
        int max =0;
        for(int i=0;i<hm.size();i++)
        {
           if(hm.get(s[i])>max)
           {
               max = hm.get(s[i]);
           }
        }
        for(Entry<String,Integer> entry:hm.entrySet())
        {
            if(entry.getValue() == max)
            {
                System.out.print(entry.getKey()+" ");
            }
        }
 
    }
}
