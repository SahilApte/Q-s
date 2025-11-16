/*
Alex is having a list of integers. He wants to find the first missing positive 
integer in the list. If he finds there are no missing positive integer, then he 
has to find the number that is to added. Your task is to help Alex in his task.

Sample test case
case=1
input=4
3 4 -1 1
output=2

case=2
input=3
1 2 0
output=3
*/
import java.util.*;
class d42p1{
    public static int findMissingPositive(int[] arr){
        int n = arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<j;i++){
            int absValue = Math.abs(arr[i]);
            if(absValue <=j && arr[absValue-1]>0){
                arr[absValue-1] *= -1;
            }
        }
        for(int i=0;i<j;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return j+1;
    }
    // private static int findMissingPositiveHelper(int[] arr, int start, int end){
    //     if(start>=end){
    //         return 1;
    //     }
    //     int j=start;
    //     for(int i=start;i<end;i++){
    //         if(arr[i]>0){
    //             int temp = arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             j++;
    //         }
    //     }
    //     for(int i=start;i<j;i++){
    //         int absValue = Math.abs(arr[i]);
    //         if(absValue<= j-start && arr[start + absValue-1]>0){
    //             arr[start + absValue-1] *= -1;
    //         }
    //     }
    //     int missing = findMissingPositiveHelper(arr,start,j-1);
    //     if(missing == j-start){
    //         return findMissingPositiveHelper(arr,j,end);
    //     }
    //     else{
    //         return missing;
    //     }
    // }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
    System.out.println(findMissingPositive(arr));
    }
}
