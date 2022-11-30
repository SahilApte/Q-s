/*
Davis is the CEO of AgroTech company. He shares his company's growth figures 
for last few years with Alan, his financial adviser, and seek his advice on 
diversification. The company makes profit when the growth is a positive value, 
loss when it is negative and no-profit no-loss when it is zero. Alan multiplies 
the growth figures and computes the result. If the result is positive, he 
suggests “1” for diversification, if result is negative, he suggests “-1” for 
no diversification and if result is zero, he suggests “0” to delay the decision 
by a month.
Your task is to help Alan project the company's diversification decision. 

Input: 5
-2 3 4 -1 2
-2 3 4 1 2    -1 test 4

Output: 1
*/
import java.util.*;

class d3p2{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt  = 1;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
            cnt *= arr[i];
        }
        if(cnt>0) System.out.println(1);
        else if(cnt<0) System.out.println(-1);
        else System.out.println(0);
    }
}
