/*
Chhota Bheem is fond of Laddus, there are N Laddus in a row, N is an even number. 
Where k-th laddu is of type-laddu[k], 1<=k<=N.
 
Due to health issues, Chhota Bheem was suggested to eat atmost N/2 Laddus of 
different types. He can eat only 1 Laddu of each type.
 
You are given an list of integers,
Your task is to find the maximum number of Laddus, Chhota Bheem can eat.
 
 
Input Format:
-------------
Line -1:An integer N,represents number of Lddus.
Line-2: N space separated integers, Laddu types.
 
Output Format:
--------------
Print an integer result.
 
Sample Input-1:
---------------
6
2 4 1 2 3 4
 
Sample Output-1:
----------------
3
 
Explanation:
------------
There are 6 Laddus, and 4 types of Laddus, 
So Bheem can eat 3 laddus only.

Sample test case
case=1
input=6
2 4 1 2 3 4
output=3 
*/
import java.util.*;
class d61p1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] laddus = new int[n];
        for(int i=0;i<n;i++){
            laddus[i] = in.nextInt();
        }
        Map<Integer,Integer> ladducnt = new HashMap<>();
        for(int laddu:laddus){
            ladducnt.put(laddu,ladducnt.getOrDefault(laddu,0)+1);
        }
        int ladduTypes = 0;
        for(int count:ladducnt.values()){
            if(count>0){
                ladduTypes++;
            }
        }
        int maxLaddus = Math.min(n/2, ladduTypes);
        System.out.println(maxLaddus);
    }
}
