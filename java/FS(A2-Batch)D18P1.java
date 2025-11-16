/*Given an array of integers, every element appears twice except for one. 
Find that single one.
Note: Your algorithm should have a linear runtime complexity. Could you 
implement it without using extra memory?

Input = [1, 2, 2, 3, 1]
Output = 3
Explanation: 3 occurs only once

case=1
input=1 2 2 3 1
output=3

case=2
input=1 2 2
output=1

case=3
input=2 3 5 5 2
output=3

case=4
input=2 3 2 3 5
output=5
*/
FS(A2-Batch)D18P1.java
import java.util.*;
public class FS(A2-Batch)D18P1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        String s[] = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        int p=0;
        for(String s1:s)
        {
            arr[p] = Integer.parseInt(s1);
            p++;
        }
        // int x = 0;
        // for(int i=0;i<s.length;i++)
        // {
        //     x = x^arr[i];
        // }
        // System.out.println(x);
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
      for(Integer c: hm.keySet())
      {
          if(hm.get(c) == 1)
          {
              System.out.println(c);
          }
      }
    }
}
