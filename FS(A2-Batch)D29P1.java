/*Rakesh is calculating maximum value of two words len(word[i]) * len(word[j])
where the words do not share common letters.

Note: if no such two words exist , return 0.

Sample TestCase
------------------------------------
input:
-----------
abcw baz foo bar xtfn abcdef

output
----------
16

Explanation:
----------------------------
abcw and xtfn two words doesnot share common letters so output is 16

Sample TestCase
------------------------------------
input:
-----------
a ab abc d cd bcd abcd

output
----------
4

Explanation:
--------------------------
ab cd two words doesnot share common*/
import java.util.*;
public class FS(A2-Batch)D29P1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int summ =0;
        int max = 0;
        for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
                boolean flag = false;
                for(int k = 0;k<s[i].length();k++)
                {
                    if(s[j].indexOf(s[i].charAt(k))!=-1)
                    {
                        flag = true;
                        break;
                    }
                }
        if(!flag)        
        {
            summ = s[i].length()*s[j].length();
            max = Math.max(max,summ);
        }
}
        }
        System.out.println(max);
    }
}
