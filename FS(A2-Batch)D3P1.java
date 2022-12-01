/*Mr.Karun is doing a maths assignment given by his teacher.
Karun's teacher asked to evaluate the expression by assuming +,-,*,/ 
the equal precedence and considering left associativity. 

Help Karun to solve the problem.
 


Sample Test Case - 1
------------------------------
input:
-----------------
2+5*2

output
----------------
14

Explanation - The expression when evaluated from start to end
we have 2+5 which is 7 and when 7 is multiplied with 2 we have 14 as the output 

Sample Test Case - 2
-----------------------------
input = 2+3*6
output = 30

Explanation :- The sum of 2+3 is 5 and 5*6 = 30 

Sample Test Case - 3
------------------------
input
-------------------
5+7-9+0*0+1
output
-------------------
1

Explanation :- The sum of 5+7 is 12 
12-9 is 3 and 3+0 is 3, 3*0 is 0 and 0+1 is 1 

Sample Test Case - 4
---------------------------------
input
------------
-1+-1*2

output
----------------
-4

Explanation :-
-1 + -1 is -2 
and -2 * 2 is -4
*/
import java.util.*;
import java.lang.*;
public class FS(A2-Batch)D3P1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int n  = 0;
        int summ =0;
        int start = Character.getNumericValue(s.charAt(0));
        // System.out.print(start);
        for(int i=1;i<s.length()-1;i++)
        {
            char c = s.charAt(i);
            int end = Character.getNumericValue(s.charAt(i+1));
            switch(c)
                {
                    case '+':
                        summ=start+end; 
                        break; 
                    case '-':
                        summ=start-end; 
                        break;
                    case '*':
                        summ=start*end; 
                        break;    
                    case '/':
                        summ=start/end;
                        break;
                }
                start = summ;
        }
        System.out.print(summ);
    }
}
