/*
You are given an integer array coin representing coins of different 
denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. 
If that amount of money cannot be made up by any combination of the coins, 
return -1.

You may assume that you have an infinite number of each kind of coin.

Sample testcase

case=1
input=3
1 2 5
11
output=3
explanation: 11 = 5 + 5 + 1

*/
import java.util.*;
class d46p7{
    /*
    public static int isVal(int a[],int n,int sum){
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            q.add(a[i]);
        }
        int count=0;
        while(!q.isEmpty() && sum >0){
            int curr = q.poll();
            int times = sum/curr;
            count +=times;
            sum -= times*curr;
            }
        return sum == 0 ? count : -1;
    }
    */
    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j] <= i){
                dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
        }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] deno = new int[n];
        for(int i=0;i<n;i++){
            deno[i] = in.nextInt();
        }
        int amt = in.nextInt();
        int res = coinChange(deno,amt);
        System.out.println(res);
    }
}
