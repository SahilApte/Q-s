/*
Alex is give an list of values in the form of an array. He has to find the 
maximum total he can compute by only selecting values at alternate index of 
the array. Your task is to help Alex in his task.

Sample test case
case=1
input=5
50 100 350 150 50
output=450
*/
import java.util.Scanner;
 public class maxarr{
//     public static void main(String args[]){
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = in.nextInt();
//         }
//         int sum1 = 0, sum2 = 0;
//         for(int i=0;i<n;i+=2){
//             sum1 +=arr[i];
//         }
//         for(int i=1;i<n;i+=2){
//             sum2 +=arr[i];
//         }
//         System.out.println(Math.max(sum1,sum2));
//     }
public static int rob(int[] nums){
    int[] memo = new int[nums.length];
    return recursive(0,nums,memo);
}
public static int recursive(int i,int nums[], int memo[]){
    if(i>=nums.length){
        return 0;
    }
    if(memo[i]>0){
        return memo[i];
    }
    memo[i] = Math.max(recursive(i+1,nums,memo),recursive(i+2,nums,memo)+nums[i]);
    return memo[i];
}
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = in.nextInt();
    }
    System.out.println(rob(arr));
}
 }

/*import java.util.Scanner;
class maxarr{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int sum1 = 0, sum2 = 0;
        int total = maxAlt(arr);
        System.out.println(total);
    }
    public static int maxAlt(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i=+2){
            sum += arr[i];
        }
        return sum;
    }
}*/
