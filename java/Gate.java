/*There is a house in which the rooms are constructed in the rows x cols grid manner.
In this house the rooms are filled with the below three possible ways.

1. -1  some barrier(not allowed to enter).
2. 0  Open (Allowed to enter).
3. 2147483647(Infinity) means an empty room.

1 within baord
2 not a brick
3 it should not be covered by
We use the value 2147483647 to represent empty room 
Fill each empty room with the distance to its nearest gate. 
If it is impossible to reach a gate, it should be filled with 2147483647(Infinity).

1 add gates pos to q 
2 m*n
3 

Sample test cases:

Input
4              
4                 
2147483647 -1 0 2147483647
2147483647 2147483647 2147483647 -1
2147483647 -1 2147483647 -1
0 -1 2147483647 2147483647
Expected output
3 -1 0 1
2 2 1 -1
1 -1 2 -1
0 -1 3 4
---------------------------------

Input
2
2
2147483647 -1
2147483647 0
Expected output
2 -1
1 0

---------------------------
input=
5
5
2147483647 2147483647 -1 0 2147483647
2147483647 2147483647 2147483647 2147483647 2147483647
0 -1 2147483647 2147483647 -1
2147483647 -1 2147483647 2147483647 -1
2147483647 2147483647 0 -1 2147483647
output=
2 3 -1 0 1
1 2 2 1 2
0 -1 2 2 -1
1 -1 1 2 -1
2 1 0 -1 2147483647
*/
import java.util.*;
class Gate
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int box[][] = new int[row][col];
        int res[][] = new int[row][col];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                box[i][j] = sc.nextInt();
                if(box[i][j]==0) q.add(new int[]{i,j});
            }
        }
        int step=1;
        while(!q.isEmpty())
        {
            int s = q.size();
            for(int i=0;i<s;i++)
            {
                int idx[] = q.poll();
                if(idx[0]>0 && box[idx[0]-1][idx[1]]!=-1 && box[idx[0]-1][idx[1]]==Integer.MAX_VALUE)
                {
                    box[idx[0]-1][idx[1]] = step;
                    q.add(new int[]{idx[0]-1,idx[1]});
                }
                if(idx[0]<row-1 && box[idx[0]+1][idx[1]]!=-1 && box[idx[0]+1][idx[1]]==Integer.MAX_VALUE)
                {
                    box[idx[0]+1][idx[1]] = step;
                    q.add(new int[]{idx[0]+1,idx[1]});
                }
                if(idx[1]>0 && box[idx[0]][idx[1]-1]!=-1 && box[idx[0]][idx[1]-1]==Integer.MAX_VALUE)
                {
                    box[idx[0]][idx[1]-1] = step;
                    q.add(new int[]{idx[0],idx[1]-1});
                }
                if(idx[1]<col-1 && box[idx[0]][idx[1]+1]!=-1 && box[idx[0]][idx[1]+1]==Integer.MAX_VALUE)
                {
                    box[idx[0]][idx[1]+1] = step;
                    q.add(new int[]{idx[0],idx[1]+1});
                }
            }
            step++;
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(box[i][j]+" ");
            }
            System.out.println();
        }
    }
}
