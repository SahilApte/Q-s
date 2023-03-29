/*
James observes his kid Teddy play in the garden. In the middle of the garden 
is a slider , which has a few metallic steps to go up the slider. Teddy can 
take either one step or two steps to go up the slider. Given the number of 
steps on the slider, James wants to know the total number of ways Teddy can 
reach the top of the slider from the ground.

Sample test case
case=1
input=5
output=8
*/
import java.util.*;
class james{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] memo = new int[n+1];
        System.out.print(func(n,memo));
    }/*
    public static int func(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else if(n == 2){
            return 2;
        }else {
            return func(n-2) + func(n-1);
        }*/
        // public static int func(int n){
        //     int dp[] = new int[n+1];
        //     dp[0] = 0;
        //     dp[1] = 1;
        //     dp[2] = 2;
        //     for(int i=3;i<=n;i++){
        //     dp[i] = dp[i-1]+dp[i-2];
        //     }
        //     return dp[n];
        // }
        public static int func(int n, int[] memo){
            if(n == 0){
                return 0;
            }else if(n == 1){
                return 1;
            }else if(n == 2){
                return 2;
            }
            if(memo[n]>0)
                return memo[n];
            memo[n] = func(n-1,memo)+func(n-2,memo);
            return memo[n];
        }
        
        //if(n<2)return 1;
        //return func(n-2) + func(n-1);
    }
