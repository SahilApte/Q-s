import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =0;
        for(int i=0;i<=n;i++)
        {
            int z=i;
            while(z!=0)
            {
                // 011 & 1 = 001
                int cal=z&1;
                if(cal==1)
                {
                    cnt=cnt+1;
                }
                z=z>>1;
            }
        System.out.print(cnt+ " ");
        cnt =0;
        }
    }
}
###### Method 2
import java.io.*;
import java.util.*;

class P3{
    static int oneCounter(int n){
        int count = 0;
        while(n > 0){
            if(n % 2 == 1){
                count += 1;
            }
            n /= 2;
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            System.out.print(oneCounter(i) + " ");
        }
    }
}
