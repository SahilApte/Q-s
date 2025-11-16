/*
David gives a box of chocolates to Alex, the chocolates are arranged in the 
form of a m*n grid. Alex’s has to carry the box of chocolates in a bag which 
has a dimension of r*c grid. David uses a technique to convert the box of 
chocolates to fit in Alex’s bag. If David is not able to convert the box of 
chocolate to the size of Alex’s bag, he has to return an empty grid. 
Your task is to help David in his task.

Sample test case

input= 2 3
1 3 5
2 4 6
3 2
output=[[1, 3], [5, 2], [4, 6]]

*/
import java.util.*;
class d16p1{
    public static void main(String args[]){
        //Queue<Integer> que = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] box = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                box[i][j] = in.nextInt();
            }
        }
        int r = in.nextInt();
        int c = in.nextInt();
        if(m*n!=r*c) System.out.println(" ");
        int[][] bag = new int[r][c];
        int t = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                bag[t/c][t%c] = box[i][j];
                t++;
            }
        }
        for(int k = 0;k<r;k++){
            for(int l = 0;l<c;l++){
                System.out.print(bag[k][l]+" ");
            }
        }
    }
}
