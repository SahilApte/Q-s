/* Given two strings A and B of the same length, determine whether you can 
 transform A into B by doing zero or more conversions.

In one conversion you can convert all occurrences of one character in A to
any other lowercase English character.

Return true if and only if you can transform A into B.

 
Time Complexity should be O(N) 

Sample Testcase:
--------------------------------
input=aabcc
ccdee
output=true

Explanation: Convert 'c' to 'e' then 'b' to 'd' then 'a' to 'c'. Note that
the order of conversions matter.

Sample Testcase:
--------------------------------
input=google
amazon
output=false

Explanation: There is no way to transform A to B.


*/

import java.util.*;
public class FS(A2-Batch)D34P2
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count =0;
        boolean flag = false;
        HashSet <Character> hs  = new HashSet<>();
        HashSet <Character> hs1  = new HashSet<>();
        for(int i=0;i<a.length();i++)
        {
            hs.add(a.charAt(i));
            hs1.add(b.charAt(i));
        }
        if(hs.size()!=hs1.size())
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }
    }
}
