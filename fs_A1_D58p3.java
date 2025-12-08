/*
Mary is having a list of values. She wants to find a sub-list having k elements 
from this, which will have highest average sum. Your task is to help Mary in her 
task.
    
Sample Input-1:
---------------
6
4 14 -8 -2 27 12
4

Explanation:
------------
Sublist is [14 -8 -2 27]
    
Sample Output-1:
----------------
7.75
  
Sample test case

case=1
input=6
4 14 -8 -2 27 12
4
output=7.75
*/
import java.util.*;
class d63p3{
    public static double subListSum(int[] arr, int subSize){
        double highAvg = 0;
        int[] subList = null;
        for(int i=0;i<arr.length-subSize+1;i++){
            double avg = 0;
            for(int j=i;j<i+subSize;j++){
                avg += arr[j];
            }
            avg /= subSize;
            if(avg > highAvg){
                highAvg = avg;
                subList = new int[subSize];
                for(int j=i;j<i+subSize;j++){
                    subList[j-i] = arr[j];
                }
            }
        }
        return highAvg;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int subSize = in.nextInt();
        System.out.println(subListSum(arr,subSize));
    }

}
