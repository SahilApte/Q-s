/*Write a program to print the following pattern 

input = 3
output =
AAAAAA
BAAAAB
BBAABB
BBAABB
BAAAAB
AAAAAA


input = 6
output = 
AAAAAAAAAAAA
BAAAAAAAAAAB
BBAAAAAAAABB
BBBAAAAAABBB
BBBBAAAABBBB
BBBBBAABBBBB
BBBBBAABBBBB
BBBBAAAABBBB
BBBAAAAAABBB
BBAAAAAAAABB
BAAAAAAAAAAB
AAAAAAAAAAAA*/

import java.io.*;
import java.util.*;
public class FS(A2-Batch)D30P1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i%n;j++)
            {
                System.out.print("B");
            }
            for(int j=0;j<2*n-i%n*2;j++)
            {
                System.out.print("A");
            }
            for(int j=0;j<i%n;j++)
            {
                System.out.print("B");
            }
            
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i%n-1;j>=0;j--)
            {
                System.out.print("B");
            }
            for(int j=n*2-(i%n)*2-1;j>=0;j--)
            {
                System.out.print("A");
            }
            for(int j=i%n-1;j>=0;j--)
            {
                System.out.print("B");
            }
            
            System.out.println();
        }
    }
}
