/*
Jones is given an integer array and asked to find out the largest sum he can 
get from the sub-arrays of the given array. 
Your task is to help Jones in his task.

Sample test case
case=1
input=4
-3 5 -2 4
output=7

*/
import java.util.*;
class d47p1{
    public static int minSub(int[] sub){
        int maxSoFar = sub[0],maxEnd = sub[0];
        for(int i=1;i<sub.length;i++){
            maxEnd = Math.max(maxEnd + sub[i],sub[i]);
            maxSoFar = Math.max(maxSoFar,maxEnd);
        }
        return maxSoFar;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(minSub(arr));
    }    
}
