/*/*
 * 
 Given two strings A and B, return true if they are equal when both are typed into empty text editors.
  # means a backspace character.


Input:gb#d
ac#d
Output: false
Explanation:  A become "gd" and B become "ad".

Input:#a#c
cc#
Output: true
Explanation: A becomes "c" while B becomes "c".


Can you do it in O(N) time and O(1) space?


TestCases :

Input: ab##
c#d#
Output: true
Explanation: Both A and B become "".

Example 3:

Input:a##c
#a#c
Output: true
Explanation: Both A and B become "c".

Example 4:

Input:a#c
b
Output: false
Explanation: A becomes "c" while B becomes "b".

*/
//#######USING STACKS
import java.util.*;
public class FS(A2-Batch)D34P1
{
    public static void main(String ar[])
    {
        Stack<Character> stc = new Stack<>();
        Stack<Character> stc1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) != '#')
            {
                stc.push(a.charAt(i));
            }
            else
            {
                if(!stc.isEmpty())
                {
                    stc.pop();
                }
            }
        }
        
        
        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)!='#')
            {
                stc1.push(b.charAt(i));
            }
            else
            {
                if(!stc1.isEmpty())
                {
                    stc1.pop();
                }
            }
        }
        
        
        if(stc.isEmpty() && stc1.isEmpty())
        {
            System.out.println(true);
        }
        
        
        else if(stc.equals(stc1))
        {
            System.out.println(true);
        }
        
        
        else
        {
            System.out.println(false);
        }
        
    }
}
//USING STRINGBUILDER
import java.util.*;
class Test
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int maxcount=0;
        int ans=0;
        for(int i=0;i<r;i++)
        {
            int l=0;
            int h=c;
            while(l<h)
            {
                int mid=l+(h-l)/2;
                if(arr[i][mid]==0) l=mid+1;
                else h=mid-1;
            }
            if(maxcount<(c-1)-l)
            {
                maxcount=(c-1)-l;
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
