/*
Adam is given an array which is in the shape of a triangle. He has to find the 
minimum path sum from top to bottom of the array. Your task is to help Adam in 
his task.

Sample test case
case=1
input=4
3
4 5
7 6 8
5 2 9 4
output=15

Explanation: 3 + 4 + 6 + 2 = 15
*/
// import java.util.*;
// public class d39p2{
//     public static int minPath(int[][] triangle){
//         int numRows = triangle.length;
//         //copy of bottom row
//         int[] minSum = triangle[numRows-1];
//         //second last row
//         for(int i = numRows-2;i>=0;i--){
//             int[] row = triangle[i];
//             //min path sum for cur row
//             for(int j = 0;j<row.length;j++){
//                 minSum[j] = row[j]+Math.min(minSum[j],minSum[j+1]);
//             }
//         }
//         //min path sum for top element
//         return minSum[0];
//     }
//     public static void main(String args[]){
//         Scanner in = new Scanner(System.in);
//         int numRows = in.nextInt();
//         int[][] triangle = new int[numRows][];
//         for(int i=0;i<numRows;i++){
//             triangle[i] = new int[i+1];
//             for(int j=0;j<=i;j++){
//                 triangle[i][j] = in.nextInt();
//             }
//         }
//         int minSum = minPath(triangle);
//         System.out.println(minSum);
//     }
// }
import java.util.*;
class d39p2{
    public static int minSum(List<List<Integer>>triangle){
        int rows = triangle.size();
        for(int r = 1;r<rows;r++){
            for(int c=0;c<=r;c++){
                int minA = Integer.MAX_VALUE;
                if(c<r)
                    minA = triangle.get(r-1).get(c);
                if(c>0)
                    minA = Math.min(minA,triangle.get(r-1).get(c-1));
                triangle.get(r).set(c,minA+triangle.get(r).get(c));
            }
        }
        return Collections.min(triangle.get(rows-1));
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        List<List<Integer>>triangle = new ArrayList<>();
        for(int r = 0;r<rows;r++){
            List<Integer>curRows = new ArrayList<>();
            for(int c = 0;c<=r;c++){
                curRows.add(in.nextInt());
            }
            triangle.add(curRows);
        }
        System.out.println(minSum(triangle));
    }
}
