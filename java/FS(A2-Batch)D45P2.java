Once upon a time, there was a curious young boy named Jack who loved
to play chess. One day, while he was playing with his grandfather, 
he noticed that there were a lot of squares on the chessboard. He 
wondered how many squares were actually on the board.

To satisfy his curiosity, Jack decided to embark on a quest to find the
total number of squares on a chessboard. He asked his grandfather, but
he didn't know the answer. So, Jack took it upon himself to find the solution.

Sample Testcase
----------------------------------------
Input: n = 2
Output: 5 
Explanation:
--------------------------------------
(4 squares of 1 unit + 1 square of 2 units)


Sample Testcase
----------------------------------------
Input: n = 3
Output: 14 
Explanation:
--------------------------------------
(9 squares of 1 unit + 4 square of 2 units 
  + 1 square of 1 unit) 
  import java.util.*;
public class Chess
{
    public static int count(int n)
    {
        int count =0;
        for(int i=1;i<n+1;i++)
        {
            count +=(n-i+1)*(n-i+1);
        }
    return count;
    }
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(count(n));
    }
}
