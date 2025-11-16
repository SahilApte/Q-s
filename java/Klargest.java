Given an integer array nums and an integer k, return the kth largest element
in the array.

Note that it is the kth largest element in the sorted order, not the kth 
distinct element.

You must solve it in O(n) time complexity.

 

Sample Testcase:
-----------------------------------------------
input=[3,2,1,5,6,4]
k = 2
output=5

/*import java.util.*;
import java.math.BigInteger;

public class File {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        String mn = sc.next();
        String s[] = mn.substring(1,mn.length()-1).split(",");
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < s.length; i++) {
            pq.add(Integer.parseInt(s[i]));
        }
        for (int i = 1; i < k; i++) {
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}
*/

import java.util.*;
import java.math.BigInteger;
public class File
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        String mn = sc.nextLine();
        String s[] = mn.substring(1,mn.length()-1).split(",");
        int k = sc.nextInt();
        BigInteger res[] = new BigInteger[s.length];
        for(int i=0;i<s.length;i++)
        {
            res[i] = new BigInteger(s[i]);
        }
        Arrays.sort(res);
        System.out.println(res[res.length-k]);
        
    }
}
