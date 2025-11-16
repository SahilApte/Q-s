/*
King Vijay and Pratap love to play game which is similar to a chessboard, only 
that board dimension can be different. During the play, the queen’s position 
for both players is on the two central diagonals. They can kill all the chess 
pieces on the diagonal and collect the sum of the values that each chess piece 
contain. While computing the sum the intersection value of the diagonals should 
be considered only once. 
Given a board of size n*n size which is filled with 
chess pieces represented by their value, your task is to return the sum of all 
these values.

Sample test case

case 1
input =3
2 3 5
6 1 4
8 7 9
output =25

case =2
input =4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
output =20

*/
import java.util.*;
class d15p2{
    /*
    public int kill(int[][] arr){
        int sum = 0,n = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i==n){
                sum+=arr[i][i];
                n--;
                continue;
            }
            sum+=arr[i][i]+ arr[i][n--];
        }
        return sum;
    }
    */
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = in.nextInt();
            }
        }
        int sum=0;
        for(int i = 0;i<board.length;i++){
            sum+=board[i][i] + board[i][board.length-i-1];
        }
        if(board.length%2!=0) sum-= board[board.length/2][board.length/2];
        System.out.print(sum);
    }
}
