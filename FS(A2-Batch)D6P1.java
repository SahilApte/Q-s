/*Ramesh is given an task to the fill the numbers for a given square grid
the grid starts with 1 and increases as first row, last column,
last row, first column similarly with second row and so on 


Sample test case:
----------------------
input
---------------------
3
output 
--------------------
1  2  3                                                                                                                            
8  9  4                                                                                                                            
7  6  5

00 01 02
10 11 12
20 21 22

Sample test case:
----------------------
input
---------------------
2
output
----------------------
1  2                                                                                                                               
4  3  

00 01
10 11
*/
import java.util.*;
class FS(A2-Batch)D6P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        int mincol = 0;
        int maxcol = n-1;
        int minrow = 0;
        int maxrow = n-1;
        int[][] print = new int[n][n];
        if(n == 1){
            System.out.println(1);
        }
        else{
            while(value<=n*n){
                for(int i = mincol;i<=maxcol;i++){
                    print[minrow][i] = value;
                    value = value+1;
                }
                for(int i = minrow+1;i<=maxrow;i++){
                    print[i][maxcol] = value;
                    value = value+1;
                }
                for(int i = maxcol-1;i>=minrow+1;i--){
                    print[maxrow][i] = value;
                    value = value+1;
                }
                for(int i = maxrow;i>=minrow+1;i--){
                    print[i][mincol] = value;
                    value = value+1;
                }
                mincol = mincol+1;
                minrow = minrow+1;
                maxcol = maxcol-1;
                maxrow = maxrow-1;
            }
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    System.out.print(print[i][j]+"\t");
                }
                System.out.println(" ");
            }
        }
    }
}
