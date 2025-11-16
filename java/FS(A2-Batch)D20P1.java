/*We have a string S of lowercase letters, and an integer array shifts.
Call the shift of a letter, the next letter in the alphabet,
(wrapping around so that 'z' becomes 'a'). 

For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.

Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.

Return the final string after all such shifts to S are applied.

Example 1:
input =abc
3 5 9
output =rpl
dbc
igc
rpl
input: S = abc, shifts = [3,5,9]
Output: rpl
Explanation: 
We start with "abc".
After shifting the first 1 letters of S by 3, we have "dbc".
After shifting the first 2 letters of S by 5, we have "igc".
After shifting the first 3 letters of S by 9, we have "rpl", the answer.

case =1
input =smallest
1 4 2 5 8 4 7 3
output =atdmhscw*/
import java.util.*;
public class FS(A2-Batch)D19P1
{
    public static String check(String s, int[] arr)
    {
        StringBuilder ans = new StringBuilder();
        int x =0;
        for(int i:arr)
        {
            x = (x+i)%26;
        }
        for(int j =0;j<s.length();j++)
        {
            int index =s.charAt(j)-97;
            ans.append((char)((index+x)%26+97));
            x = Math.floorMod(x-arr[j],26);
        }
        return ans.toString();
    }
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        sc.nextLine();
        String []s1 = sc.nextLine().split(" ");
        int arr[] = new int[s1.length];
        int p =0;
        ArrayList<String> lst = new ArrayList<>();
        for(String q:s1)
        {
            arr[p] = Integer.parseInt(q);
            p++;
        }
        System.out.println(check(s,arr));
    }
}
