/*A confusing number is a number that when rotated 180 degrees becomes a different number with each digit valid.

We can rotate digits of a number by 180 degrees to form new digits.

When 0, 1, 6, 8, and 9 are rotated 180 degrees, they become 0, 1, 9, 8, and 6 respectively.
When 2, 3, 4, 5, and 7 are rotated 180 degrees, they become invalid.
Note that after rotating a number, we can ignore leading zeros.

For example, after rotating 8000, we have 0008 which is considered as just 8.
Given an integer n, return the number of confusing numbers in the inclusive range [1, n]

Input: n = 20

Input: 20
Output: 6
Explanation: 
The confusing numbers are [6,9,10,16,18,19].
6 converts to 9.
9 converts to 6.
10 converts to 01 which is just 1.
16 converts to 91.
18 converts to 81.
19 converts to 61.*/

import java.util.*;
public class FS(A2-Batch)D30P3
{
    public static boolean isConfused(String s,String valid,Map<Character,Character> mp)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char digit = s.charAt(i);
            if(valid.indexOf(digit)==-1)
                return false;
            sb.append(mp.get(digit));
        }
        return !s.equals(sb.toString());
    }
    public static void main(String args[])
    {
        Boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String valid = "01689";
        HashMap <Character,Character> mp = new HashMap<>();
        mp.put('0','0');
        mp.put('1','1');
        mp.put('6','9');
        mp.put('9','6');
        mp.put('8','8');
        int count =0;
        for(int i=1;i<=n;i++)
        {
            if(isConfused(Integer.toString(i),valid,mp))
                count++;
        }
        System.out.println(count);
    }
}
