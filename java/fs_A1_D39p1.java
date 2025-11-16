/*
David gives a task to his student Amber. He provides an integer nRows, and asks 
Amber to return the first nRows of Pascal’s triangle. In Pascal's triangle, 
each number is the sum of the two numbers directly above it. Your task is to 
help Amber in her task.

Sample test case
case=1
input=5
output=[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
*/
import java.util.*;
class pascal{
    public static List<List<Integer>>generate(int n){
        List<List<Integer>>triangle = new ArrayList<List<Integer>>();
        if(n==0){
            return triangle;
        }
        List<Integer>firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1;i<n;i++){
            List<Integer>prevRow = triangle.get(i-1);
            List<Integer>curRow = new ArrayList<Integer>();
            curRow.add(1);
            for(int j=1;j<i;j++){
                int sum = prevRow.get(j-1)+prevRow.get(j);
                curRow.add(sum);
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>>triangle = generate(n);
        for(List<Integer>row:triangle){
            System.out.println(row);
        }
    }
}
