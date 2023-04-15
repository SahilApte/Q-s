An n-digit number that is a Narcissistic Number must
satisfy the following equation:

a1^n + a2^n + ... + an^n = a1a2...an

where a1, a2, ..., an are the individual digits of the number.

Print yes if satisfies else no

Sample Testcase:
-------------------------------------------
input=153 
output=yes

Explanation:
----------------------------------------
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

Sample Testcase:
-------------------------------------------
 input=1634
 output=yes

Explanation:
----------------------------------------
1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
 import java.util.*;
public class Prog
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int sum =0;
        for(int i=0;i<s.length();i++)
        {
            sum+=Math.pow(Integer.valueOf(s.charAt(i)-48),s.length());
        }
        System.out.println(String.valueOf(sum).equals(s)?"yes":"no");
    }
}

