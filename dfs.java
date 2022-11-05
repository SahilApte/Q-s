sol:
-----------
import java.util.*;
public class Program
{
    public static int dfs(int i,int j,int [][]arr)
    {
        if(i<0||i>=arr.length||j<0||j>=arr[0].length||arr[i][j]==0)
        return 0;
        arr[i][j]=0;
        int ans = 1;
        ans +=dfs(i+1,j,arr);
        ans +=dfs(i-1,j,arr);
        ans +=dfs(i,j+1,arr);
        ans +=dfs(i,j-1,arr);
        ans +=dfs(i+1,j+1,arr);
        ans +=dfs(i-1,j+1,arr);
        ans +=dfs(i+1,j-1,arr);
        ans +=dfs(i-1,j-1,arr);
        
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]arr = new int[row][col];
        for(int i =0;i<row;i++)
        {
            for(int j = 0 ;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0,max= 0;
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                if(arr[i][j]==1)
                {
                    count = dfs(i,j,arr);
                    if(max<count)
                    {
                        max = count;
                    }
                }
            }
        }
        System.out.print(max);
    }
}
