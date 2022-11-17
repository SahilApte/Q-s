import java.util.*;
public class War{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char arr[][] = new char[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        int s = numIslands(arr);
        System.out.println(s);
    }
    public static int numIslands(char[][] grid) 
    {
        int count =0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='W' && visited[i][j] == false)
                {
                    dfs(i,j,grid,visited);
                    count ++;
                }
            }
        }
        return count;
    }
        public static void dfs(int i,int j,char[][] grid,boolean[][] visited)
        {

            if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 'E' || visited[i][j] ==true)

            {
                return;
            }
            visited[i][j] = true;
            dfs(i,j-1,grid,visited);

            dfs(i-1,j,grid,visited);

            dfs(i,j+1,grid,visited);

            dfs(i+1,j,grid,visited);
        }
}
