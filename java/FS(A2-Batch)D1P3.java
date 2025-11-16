/*Mr.Donald is teaching his students about number systems.
    -He has given assignment to the students to check whether the
    given number N belongs to binary number system or not.
    
    Your task is to help the students in completing their assignment. 


Input Format:
-------------
An Integer N.


Output Format:
--------------
Print true or false.


Sample Input:1
---------------
111100

Sample Output:1
---------------
true

Sample Input:2
---------------
1120 

Sample Output:1
---------------
false

*/
import java.util.*;
public class FS(A2-Batch)D1P3
{
    static boolean check(String s)
    {
        boolean flag = true;
        for(int i=0;i<s.length();i++)
        
        {
            if(s.charAt(i)!='1' && s.charAt(i)!= '0')
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(check(n));
        
    }
}
