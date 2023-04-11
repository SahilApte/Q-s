Mr Murthy is a math teacher. He is given a problem to his students.
The students are given a number N, and the student has to perform following step:
    -Power each digit of a number with their respective positions and sum them.
    Finally check if sum is equal to the given N itself.

    Your task is to help the students to perform the above steps and 
    print the "Yes" if sum is equal to N or "No" otherwise.
 




Input Format:
-------------
An integer, number N.

Output Format:
--------------
Print Yes or No.


Sample Input-1:
---------------
135

Sample Output-1:
----------------
Yes

Explanation: 
------------
135 =>1^1+3^2+5^3
Answer is Yes

Sample Input-2:


---------------
80

Sample Output-2:
----------------
No

Explanation: 
------------
80 =>8^1+0^2
Answer is No

import java.util.*;
public class File
{
    public static void main(String ar[])
    {
    Scanner sc= new Scanner(System.in);
    String a = sc.next();
    char []ab = a.toCharArray();
    int p =1;
    int sum =0;
    for(int i=0;i<ab.length;i++)
    {
        System.out.print(ab[i]+" ");
       sum += Math.pow(Integer.valueOf(ab[i])-48,p);
       System.out.print(sum+" ");
       p++;
    }
    String s = String.valueOf(sum);
    System.out.println(s.equals(a)?"yes":"no");

    
}}
