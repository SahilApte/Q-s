There is  a set of 'N' bags contains apples.
Each bag carries few number of apples.
You need to pick 'K' bags everytime from left to right.
and find the bag which contains max number of apples 'M'.
You need to return the value fo M each time.

Bags array indicates the apples count in each bag.

Input: Bags = [1,2,3,5,4,6,8,7], and k = 3
Output: 3 5 5 6 8 8
Explanation: 

			K Bags		Max
			-----------    -----
			1 2 3			3
			2 3 5			5
			3 5 4			5
			5 4 6			6
			4 6 8			8
			6 8 7			8

Can you solve it in linear time?
import java.util.*;
public class Hi
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s[] = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            arr[i]=Integer.valueOf(s[i]);
        }
        int n = arr.length;
        // 12345
        // 2
        // 3
        // 0
        //12354687
        //3
        //355688
        for(int i = 0;i<=n-k;i++)
        {
            int curr =0;
            for(int j=0;j<k;j++)
            {
                curr = Math.max(curr,arr[i+j]);
            }
            lst.add(curr);
        }
        // for(int i=0;i<lst.size();i++)
        // {
        //     System.out.print(lst.get(i)+" ");
        // }
        System.out.println(lst);
       
        
    }
}
