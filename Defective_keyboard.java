/*Ram and Bheem are using a Desktop Computer.One day they found that keyboard 
is defective in which if you type backspace button,it will print '$', 
instead of removing one previous character.

Bheem and Ram have tried to type one word each on the same keyboard.
Return true, if both tried to type the same word. Otherwise return false.

Note:backspace for an empty text will continue empty.

Input Format:
-------------
Line-1:Two space seperated strings represents words w1,w2.

 
Output Format:
--------------
Print a boolean result.
 
Constraints:

    1 <= w1.length, w2.length <= 200
    w1 and w2 only contain lowercase letters and '$' characters.



Sample Input-1:
---------------
pq$r  pt$r

Sample Output-1:
----------------
true

Explanation:
------------
Both wants to type 'pr'

Sample Input-2:
---------------
se$$at cea$$t

Sample Output-2:
----------------
false

Sample Input-3:
---------------
s$$at ce$$at

Sample Output-2:
----------------
true

Explanation:
------------
Both wants to type 'at'.
*/
import java.util.*;
public class Defective_keyboard
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        Stack<Character> st = new Stack<Character>();
        Stack<Character> st1 = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='$')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(!st.empty()){
                st.pop();
            }}
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!='$')
            {
                st1.push(s1.charAt(i));
            }
            else
            {
                if(!st1.empty()){
                st1.pop();}
            }
        }
        System.out.println(st.equals(st1));
        
    }
}
