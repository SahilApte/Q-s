/*
A Street Seller wants to get the maximum profit by buying and selling the item. 
He has permission to complete at most one transaction ,(ie, buy one item and 
sell one item) with the following rules:
Note that he cannot sell an item before he buys one.

Sample test case
case=1
input=5
8 2 6 4 7 5
output=5

Explanation: Buy on day 2 (price = 2) and sell on day 5 (price = 7), 
profit = 7-2 = 5.
*/

import java.util.*;
class d48p2{
    public static int getMax(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price: prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price-minPrice);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(getMax(arr));
    }
}
