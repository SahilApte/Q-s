/*Mr Hacker has given a color code system as a grid of size R*C, the color codes are 
in the range of 1 to 10 and the grid is 0-indexed.

He has given a task to crack the original grid by using three values, Ri, Cj, Code.
The way to crack the original color codes in the grid is as follows:
    1. You have to start updating the color codes from (Ri,Cj) position in 
    the grid with the given color code, 'Code'.
    2. Updating color codes means, replace the color codes from the cell (Ri,Cj) 
      in the grid, and replace all the cells connected in 4 directions
      (Up, Down, Left, Right) and having same color-code of starting cell.
    3. Repeat the step-2 from the updated cells until no more cells to update.

Your task is to help Mr.Hacker to get the original color-code system grid
and print it.


Input Format:
-------------
Line-1: Two space sepearted integers, R and C.
Next R lines: C space separated integers, grid[][].
Last line: Three space sepaarted integers, Ri,Cj and Code.

Output Format:
--------------
Print the resultant grid.


Sample Input-1:
---------------
3 4
1 0 1 1
0 1 1 1
1 1 0 1
1 3 3

Sample Output-1:
----------------
1 0 3 3
0 3 3 3
3 3 0 3


Sample Input-2:
---------------
3 4
1 0 1 1
0 1 1 1
1 1 0 1
0 0 3

Sample Output-2:
----------------
3 0 1 1
0 1 1 1
1 1 0 1
*/
import java.util.*;

class D30p3
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]= new int[row][col];
        int ans[][]= new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int rs = sc.nextInt();
        int cs = sc.nextInt();
        int num = sc.nextInt();
        int [][]visited = new int[row][col]; 
        dfs(arr,rs,cs,num,visited,arr[rs][cs]);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
}

public static void dfs(int[][] arr,int i,int j,int num,int[][] visited,int color)
{
    if(i<0 || j<0 || i>=arr.length||j>=arr[0].length ||arr[i][j] !=color||visited[i][j]==1)
    {
        return;
    }
    arr[i][j] = num;
    visited[i][j] = 1;
    dfs(arr,i,j+1,num,visited,color);
    dfs(arr,i-1,j,num,visited,color);
    dfs(arr,i,j-1,num,visited,color);
    dfs(arr,i+1,j,num,visited,color);
    
}
}
