Write a program to interchange the middle row and middle column  elements of a 
matrix .

Accept the number of rows and columns of the matrix from the user if the matrix
is not a square matrix print -1.

*assume it is odd dimensions matrix. 


Sample Testcase:
------------------------------------------------
input =
5 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

output =
1 2 11 4 5 
6 7 12 9 10 
3 8 13 18 23 
16 17 14 19 20 
21 22 15 24 25 


import java.util.*;
public class Middle
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] =new int[r][c];
        if(r!=c){
            System.out.println(-1);
            return;}
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int temp =0;
      int x =0;
      int y =0;
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
              if(i==r/2)
              {
                  temp = arr[j][r/2];
                  arr[j][r/2]=arr[r/2][j];
                  arr[r/2][j] = temp;
              }
          }
      }
      
      
      
      
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        
        
    }
}
