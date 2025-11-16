/*
Robin is given a grid of dimensions 9*9, the grid has integers or a dot ‘.’. 
Robin has to check if the grid is valid. The cell needs to validated according 
to following rules.

1. Each row must contain the digits 1-9 without repetition.
2. Each column must contain the digits 1-9 without repetition.
3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Your task is help Robin in his task.

Sample test case
case=1
input= 9
3 9 0 7 5 2 0 0 0 
5 0 4 0 0 0 0 7 0
0 0 2 0 8 0 0 9 0
1 8 9 6 0 0 4 5 7
2 0 0 0 1 0 3 8 6
6 0 7 8 0 0 0 1 9
8 0 1 2 0 6 9 4 5
9 5 0 1 0 4 6 0 0
0 0 0 5 9 8 7 3 1
output=true
*/
import java.util.*;
class d48p3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(isvalidGrid(grid));
    }
    static boolean isvalidGrid(int[][] grid){
        int len = grid.length;
        HashSet<Integer>[] rSet = new HashSet[len];
        HashSet<Integer>[] cSet = new HashSet[len];
        HashSet<Integer>[] boxSet = new HashSet[len];
        for(int i=0;i<len;i++){
            rSet[i] = new HashSet<Integer>();
            cSet[i] = new HashSet<Integer>();
            boxSet[i] = new HashSet<Integer>();
        }
        for(int r=0;r<len;r++){
            for(int c=0;c<len;c++){
                int val = grid[r][c];
                if(val == 0) continue;
                
                if(rSet[r].contains(val))
                    return false;
                    rSet[r].add(val);
                    
                if(cSet[c].contains(val))
                    return false;
                    cSet[c].add(val);
                int idx = ((r/3)*3) + (c/3);
                    
                if(boxSet[idx].contains(val))
                return false;
                boxSet[idx].add(val);
            }
        }
        return true;
    }
}
