/*Write a program to read a string from the user and print the following pattern 

Input - The input consists of one word
Output - For the given input string print the pattern as shown in the test case

Sample Test case
--------------------------------
input
-----------------
ngit

output
----------------------
n
gg
iii
tttt

Explanation -
The first line of output should print the first character once 
followed by second character twice followed by third character thrice 
till it reaches the end of string 


Sample Test case
--------------------------------
input
-----------------
welcome

output
------------------
w
ee
lll
cccc
ooooo
mmmmmm
eeeeeee
*/
import java.util.*;
public class FS(A2-Batch)D3P2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(s.charAt(i-1));
            }
            System.out.println();
        }
    }
}
