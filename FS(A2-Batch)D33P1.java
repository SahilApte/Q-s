/*Once upon a time, there was a mathematician named John who was 
fascinated by number sequences. One day, he discovered a new
sequence called the count-and-say sequence.

The count-and-say sequence starts with the number 1, and each 
subsequent number in the sequence is determined by "saying" the
previous number. To "say" a number, John would split it into the
minimal number of substrings, each containing exactly one unique
digit. Then, for each substring, he would say the number of digits, 
followed by the digit itself. Finally, he would concatenate all the
said digits to form the next number in the sequence.

John was intrigued by this sequence and began to explore it further.
He calculated the first few numbers in the sequence and found that 
it went like this: 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211,
and so on.

Sample Testcase:
---------------------------------------
input=1
output=1
Explanation: This is the base case.

Sample Testcase:
---------------------------------------
input=4
output=1211*/

import java.util.*;
public class FS(A2-Batch)D33P1
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String s = "1";
        for(int i=1;i<n;i++)
        {
        StringBuilder sb = new StringBuilder();
        int cnt =1;
            for(int j=1;j<s.length();j++)
            {
                if(s.charAt(j)==s.charAt(j-1))
                {
                    cnt++;
                }
                else
                {
                    // sb.setLength(0);
                    sb.append(cnt);
                    sb.append(s.charAt(j-1));
                    cnt =1;
                }
            }
            sb.append(cnt);
            sb.append(s.charAt(s.length()-1));
            s = sb.toString();
        }
        System.out.println(s);
        }
    }
