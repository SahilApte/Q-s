/*Mr.Raju a math teacher asked his student to count the number of balls which
are marked with odd value and even value from a given 'M' and 'N' value
(inclusive of both 'M' and 'N').
Your task is to help student to find the count and display both.


Sample Testcase:
---------------------------
input=20
40
output=10,10

Sample Testcase:
---------------------------
input=12
15
output=2,2*/
import java.util.*;
public class FS(A2-Batch)D2P1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ec=0;
        int oc = 0;
        for(int i=m;i<=n;i++){int max = (i%2==0)? ec++:oc++;}
         
        System.out.print(oc+","+ec);
    }
}
