
https://leetcode.com/problems/rotting-oranges/description/
994. Rotting Oranges
Medium
10.3K
343
Companies
You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 

Example 1:


Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
Example 2:

Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
Example 3:

Input: grid = [[0,2]]
Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 10
grid[i][j] is 0, 1, or 2.
Accepted
593.9K
Submissions
1.1M
Acceptance Rate
53.0%
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> qu= new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    qu.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;
        int count =0;
        while(!qu.isEmpty())
        {
            ++count;
            int size = qu.size();
            for(int i=0;i<size;i++)
            {
            int rot[]=qu.poll();
            int dirs[][]= {{-1,0},{0,-1},{0,1},{1,0}};
            for(int dir[]:dirs)
            {
                int x = dir[0]+rot[0];
                int y = dir[1]+rot[1];
                if(x<0||y<0||x>=grid.length||y>=grid[0].length||grid[x][y]==0||grid[x][y]==2)continue;
                grid[x][y]=2;
                qu.offer(new int[]{x,y});
                fresh--;
            }
        }

    }
        return fresh==0?count-1:-1;
    }}
