/*A confusing number is a number that when rotated 180 degrees becomes a 
different number with each digit valid.

We can rotate digits of a number by 180 degrees to form new digits.

When 0, 1, 6, 8, and 9 are rotated 180 degrees, they become 0, 1, 9, 8, and 6 
respectively.
When 2, 3, 4, 5, and 7 are rotated 180 degrees, they become invalid.
Note that after rotating a number, we can ignore leading zeros.

For example, after rotating 8000, we have 0008 which is considered as just 8.
Given an integer n, return true if it is a confusing number, or false otherwise.

Example 1:

Input: n = 6
Output: true
Explanation: We get 9 after rotating 6, 9 is a valid number, and 9 != 6.
Example 2:

Input: n = 89
Output: true
Explanation: We get 68 after rotating 89, 68 is a valid number and 68 != 89.
Example 3:

Input: n = 11
Output: false
Explanation: We get 11 after rotating 11, 11 is a valid number but the
value remains the same, thus 11 is not a confusing number
*/
import java.util.*;
public class FS(A2-Batch)DP30
{
    public static void main(String args[])
    {
        Boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String s=  sc.nextLine();
        String res = "";
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='0')
                res+=0;
            else if(c =='1')
                res+=1;
            else if(c =='6')
                res+=9;
            else if(c=='9')
                res+=6;
            else if(c =='8')
                res+=8;
            else
            {
                flag = false;
            }
        }
        // System.out.println(res);
        StringBuilder sb = new StringBuilder(res);
        res = sb.reverse().toString();
        // System.out.println(res);
        if(res.length()!=s.length())
        {
            flag = false;
        }
        else
        {
            if(res.equals(s))
            {
                flag = false;
            }
            else
            {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
