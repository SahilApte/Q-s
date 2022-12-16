/*
Mr.Gupta is the head of Income Tax department. He has a list of people who are 
hiding black money is various banks. He wants to conduct IT raid on these people 
and find the person who has the maximum amount of black money. 
Your task is to help Anand find the maximum amount hidden by a person.

Input: 3 3
2 3 3
4 5 6
6 3 2
Output: 15

Explanation:
Input: Number of person and number of banks, followed by money stored 
in various banks.
Output: 15 (4+5+6 = 15)
*/
import java.util.*;
class d14p2{
    /*
    public int maxSum(int max[][]){
        int maxarr=0;
        for(int r[]:max){
            int curSum = Integer.MIN_VALUE;
            for(int r: row){
                curSum += r;
            }
            maxarr = Math.max(CurSum, maxarr);
        }
        return maxarr;
    }
    */
    public static void main(String args[]){
        d14p2 obj = new d14p2();
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int max[][] = new int [row][col];
        for(int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                max[i][j] = in.nextInt();
            }
        }
        /*
        int sum = 0;
        for(int i = 0;i<row;i++){
            int s = 0;
            for(int j = 0;j<col;j++){
                s+=max[i][j];
            }
            if(s>sum){
                sum=s;
            }
        }
        System.out.println(sum);
        */
        System.out.println(obj.maxSum(max));
    }
}
