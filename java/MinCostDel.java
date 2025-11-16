You want to delete some letters from S to obtain a string without two identical
letters next to each other.What is the minimum total cost of deletions to achieve
such a string?

Input Format:
----------------------
Line-1: String S of length 'N'
Line-2: Array of integers of length 'N'

Output Format:
----------------------
Minimum cost of deletions


Sample TestCase:
-----------------------------------
input=abccdb
0 1 2 3 4 5
output=2

Explanation:
-------------------------
Delete the first occurence of 'c' to achieve abcdb.
import java.util.*;
public class Prg
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = sc.nextLine().split(" ");
        int arr[]= new int[s1.length];
        int summ =0;
        for(int i=0;i<s1.length;i++)arr[i]=Integer.parseInt(s1[i]);
        for(int i=0;i<arr.length-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                int min = Math.min(arr[i],arr[i+1]);
                if(min == arr[i])arr[i] = Integer.MAX_VALUE;
                else if(min == arr[i+1])arr[i+1] = Integer.MAX_VALUE;
                summ+=min;
            }
        }
        System.out.println(summ);
        
    }
}
