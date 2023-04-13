Rishi is given a group of numbers(nums) which are >0 

He has to print the count of pairs(i,j) in the group which obeys the below rule 

0 <= i < j < nums.length
nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])


Let us assume reverse(ele) as the reverse of the number 'ele' . 

For example, rev(123) = 321 , and rev(120) = 21 . 



Sample Testcase:
-------------------------------------------
Input = 4
42 11 1 97
Output = 2

Explanation: The two pairs are:
- (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
- (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.

import java.util.*;
public class File
{
    public static int rev(int n)
    {
        int res = 0;
        while(n!=0)
        {
            res = res*10+n%10;
            n/=10;
        }
        return res;
    }
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int b  = sc.nextInt();
        // System.out.println(rev(b,""));
        int nums[] = new int[b];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] + rev(nums[j]) == nums[j] + rev(nums[i]))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
