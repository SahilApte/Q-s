import java.util.*;

public class Coal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] coal = new int[n];
        int[] cost = new int[n];
        
        for(int i = 0; i < n;i++) coal[i] = sc.nextInt();
        for(int i = 0; i < n;i++) cost[i] = sc.nextInt();
        
        int i = 0;
        boolean in = true;
        while(i < n && in){
            int initial = coal[i], j = i + 1;
            if(j == n && in){
                j = 0;
                in = false;
            }
            while(j < n){
                if(j != 0){
                    if(initial - cost[j-1] >= 0){
                        initial = initial - cost[j-1] + coal[j];
                    } else break;
                } else {
                    if(initial - cost[n-1] >= 0){
                        initial = initial - cost[n-1] + coal[j];
                    } else break;
                }
                if(i == j){
                    System.out.println(i);
                    return;
                }
                j += 1;
                if(j == n && in){
                    in = false;
                    j = 0;
                }
            }
            i = j;
        }
        System.out.println(-1);
    }
}
