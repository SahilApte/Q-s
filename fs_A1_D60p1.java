/*
Given an array of integers nums which is sorted in ascending order, and an 
integer target, write a function to search target in nums. If target exists, 
then return its index. Otherwise, return -1.

Note: Implement binary search using recursion.

Sample test case
case=1
input=6
-2 -1 3 7 9 11
7
output=3
*/
import java.util.*;
class d60p1{
    public static int binSearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(binSearch(arr, target));
    }
}
