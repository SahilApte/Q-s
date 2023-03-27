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
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int sum1 = 0, sum2 = 0;
        for(int i=0;i<n;i+=2){
            sum1 +=arr[i];
        }
        for(int i=1;i<n;i+=2){
            sum2 +=arr[i];
        }
        System.out.println(Math.max(sum1,sum2));
    }
}
