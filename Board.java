import java.util.*;
class Board
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
