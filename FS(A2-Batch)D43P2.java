Suman is interested in playing with kids,
Suman given a list of words to kids, and also two more words.

Suman asked the kids to find the minimum distance between the two words
from the list of words.
Two words given may be same and they represent two individual words in the list.

Can you help the kids to findout the minimum distance between the two words
from the list of words.

Note : You may assume two words are in the list.

Sample Testcase:
-----------------------------------------------
Input: practice makes you perfect
makes perfect
Output: 2

Sample Testcase:
-----------------------------------------------
Input: chef makes a cake using cake mix
cake cake
Output: 2

Sample Testcase:
-----------------------------------------------
Input: good bad worst good good bad bad
bad bad
Output: 1
import java.util.*;
public class Space
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        String a = sc.next();
        String b = sc.next();
        int min = Integer.MAX_VALUE;
        int A = -1;
        int B = -1;
        for(int i=0;i<s.length;i++)
        {
            if(a.equals(s[i]))
            {
                A = i;
                if(A != B)
                {
                    min = Math.min(min, Math.abs(A - B));
                }
            }
            if(b.equals(s[i]))
            {
                B = i;
                if(A != B)
                {
                    min = Math.min(min, Math.abs(A - B));
                }
            }
        }
        System.out.println(min);
    }
}
