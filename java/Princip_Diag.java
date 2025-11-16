import java.io.*;
import java.util.*;
import java.lang.*;
public class Hello
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]mat = new int[r+1][c+1];
        boolean flag = true;
        for(int i =1;i<=r;i++)
        {
            for(int j =1;j<=c;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i =1;i<=r-1;i++)
        {
            for(int j =i;j<=c-1;j++)
            {
                if(mat[i][j] != mat[i+1][j+1])
                    flag = false;
            }
        }
    System.out.println(flag);
        
    }
}
