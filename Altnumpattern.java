Write a program to print the following pattern 


input = 5
output = 
1 2 3 4 5
15 14 13 12
6 7 8
11 10
9


input = 6
output = 
21 20 19 18 17 16
1 2 3 4 5
15 14 13 12
6 7 8
11 10
9

input = 7
output = 
1 2 3 4 5 6 7
28 27 26 25 24 23
8 9 10 11 12
22 21 20 19
13 14 15
18 17
16



input = 8
output = 
36 35 34 33 32 31 30 29
1 2 3 4 5 6 7
28 27 26 25 24 23
8 9 10 11 12
22 21 20 19
13 14 15
18 17
16

import java.util.*;
public class Prog
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        int count =1;
        // System.out.println(sum);
        for(int i = 0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(n%2==0){
                if(i%2==0)
                {
                    System.out.print(sum+" ");
                    sum--;
                }
                else 
                {
                    System.out.print(count);
                    System.out.print(" ");
                    count++;
                }
            }   
            else if(n%2!=0){
                if(i%2!=0)
                {
                    System.out.print(sum+" ");
                    sum--;
                }
                else 
                {
                    System.out.print(count);
                    System.out.print(" ");
                    count++;
                }
            }}
            System.out.println();
        }
    }
}
