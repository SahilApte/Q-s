/*You are provided a string of characters(lowercase only),
You can change the order of the characters of the string.
After changing the order, the resultant string should be 
no two immidiate characters are same.

Return true, if you are able to find such resultant string, 
Otherwise false.

Input Format:
-------------
A String S

Output Format:
--------------
Print a boolean value.


input = aaabd
output = true
a,1 2 3
b,1 
d,1
m=0;
i>m
i=m
m=3

input =aaab
output =false

*/
import java.util.*;
public class FS(A2-Batch)D8P2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(mp.containsKey(s.charAt(i)))
            {
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else
            {
                mp.put(s.charAt(i),1);
            }
        }
        int max= Integer.MIN_VALUE;
        for(Integer i: mp.values())
        {
            if(i>max)
                max = i;
        }
        Boolean res = max<=((s.length()+1)/2)?true:false;
        System.out.println(res);
    }
}
