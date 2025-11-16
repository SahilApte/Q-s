/*
Kate is given an m*n integer matrix, each row in the matrix is sorted in 
ascending order. The first value of each row is greater than the last value 
of the previous row. She is also given a target value, and asked to find 
whether the target is in the matrix, she has to return true if found else 
return false. Your task is to help Kate in her task.

Note: You must write the solution in O(log(m*n)).

Sample test case
case=1
input=3 4
2 4 6 8
11 12 17 21
24 31 35 61
4
output=true

*/
import java.util.*;
class d49p1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int tarVal = in.nextInt();
        System.out.println(checkPrev(arr,tarVal));
    }
    public static boolean checkPrev(int[][] grid, int tarVal){
        int m = grid.length;
        if(m==0) return false;
        int n = grid[0].length;
        int left = 0, right = m*n-1;
        while(left<=right){
            int mid = left+(right - left)/2;
            int midNum = grid[mid/n][mid%n];
            if(midNum == tarVal){
            return true;
            } 
            else if(midNum<tarVal)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
    /*
     public static boolean checkPrev(int[][] arr, int target){
        int r = 0, c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<=target) 
                r=i;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[r][j]==target)
                return true;
            }
            return false;
    }*/
    /*
    public static boolean checkPrev(int[][] arr, int target){
    int initial=0, end=arr.length-1;
    while(initial<=end){
        int mid = initial+(end-initial)/2;
        if(target < arr[mid]){
            return end = mid-1;
        } else if(target > arr[mid]){
        return initial = mid+1;
        }else{
            return true;
        }
    }
    return false;
    */
}
