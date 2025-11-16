
Given a 6x6  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values with indices 
falling in this pattern in arr's graphical representation:

a b c
  d
e f g

There are 16 hourglasses in arr, and an hourglass sum is the sum of an 
hourglass' values. Calculate the hourglass sum for every hourglass in arr, 
then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0

We calculate the following  hourglass values:

-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18

Our highest hourglass value is 28 from the hourglass:

0 4 3
  1
8 6 6

output:  It should return an integer, the maximum hourglass sum in the array.


Constraints
-9<=arr[i][j]<=9
0<=i,j<=5

Output Format

Print the largest (maximum) hourglass sum found in arr.

input =
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
output = 19

Explanation
contains the following hourglasses:

1 1 1  1 1 0  1 0 0  0 0 0
  1      0      0      0
1 1 1  1 1 0  1 0 0  0 0 0

0 1 0  1 0 0  0 0 0  0 0 0
  1      1      0      0
0 0 2  0 2 4  2 4 4  4 4 0

1 1 1  1 1 0  1 0 0  0 0 0
  0      2      4      4
0 0 0  0 0 2  0 2 0  2 0 0

0 0 2  0 2 4  2 4 4  4 4 0
  0      0      2      0
0 0 1  0 1 2  1 2 4  2 4 0

The hourglass with the maximum sum (19) is:

2 4 4
  2
1 2 4

so output is 19
import java.util.*;
public class Hour
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int max =Integer.MIN_VALUE;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                int summ =arr[i][j]+ arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                max = Math.max(summ,max);
            }
        }
        System.out.print(max);
    }
    
}
