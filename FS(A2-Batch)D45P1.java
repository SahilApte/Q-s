Let's say that you are a math teacher, and you want to challenge your
students with a tricky math problem. You give them the following problem:

"Count the number of times the digit 2 appears in all the numbers
from 0 to n."

Sample Testcase:
-----------------------------------------------
input=22
output=6
Explanation:
---------------------------------
Total 2s that appear as digit from 0 to 22 are (2, 12, 20,21, 22);

Sample Testcase:
-----------------------------------------------
Input=100
Output=20
Explanation: 
----------------------------------
total 2's comes between 0 to 100 
are (2, 12, 20, 21, 22..29, 32, 42, 52, 62, 72,82, 92);
import java.util.*;
public class Two
{
    public static int checktwo(int n)
    {
        int count =0;
        for(int i=0;i<=n;i++)
        {
            String s = String.valueOf(i);
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='2')
                count++;
            }
        }
        return count;
    }
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checktwo(n));
    }
}
