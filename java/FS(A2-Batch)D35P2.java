/*Given an array with n integers, your task is to check if it could become 
non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds 
for every i (1 <= i < n).

Sample TestCase:
---------------------------
input=[4,2,3]
output=True
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.

Sample TestCase:
---------------------------
input=[4,2,1]
output=False
Explanation: You can't get a non-decreasing array by modify at most one element.
*/
import java.util.*;
public class Gile
{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int arr[]= new int[s.length];
        int p=0;
        for(String s1:s)
        {
            arr[p]= Integer.parseInt(s[p]);
            p++;
        }
        int cnt =0;
        for(int i=0;i<arr.length-1;i++)
            if(arr[i]>arr[i+1])
                cnt++;
        System.out.println(cnt>1?false:true);
    }
}
