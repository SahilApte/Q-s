
Jasmine, a computer science student, was given an assignment 
to find the minimum value of a string s after removing k characters,
where s consists of lowercase alphabets. The value of the string is 
defined as the sum of squares of the count of each distinct character. 

Sample Testcase:
-------------------------------------

Input: s = abccc, k = 1
Output: 6

Explanation:
---------------------------------
We remove c to get the value as 12 + 12 + 22
 
Sample Testcase:
-------------------------------------

Input: s = aabcbcbcabcc, k = 3
Output: 27
3a 
4b
5c
Explanation:
------------------------------------
We remove two 'c' and one 'b'. 
Now we get the value as 32 + 32 + 32.

import java.util.*;
import java.util.Map.*;
public class San
{
    public static ArrayList<Integer>getmax(ArrayList<Integer>lst,int k)
    {
        if(k==0)
        {
            return lst;
        }
        else
        {
            int m = Collections.max(lst);
            lst.set(lst.indexOf(m),m-1);
            k--;
            return getmax(lst,k);
        }
    }
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        TreeMap<Character,Integer> hm= new TreeMap<>();
        String s = sc.next();
        int k =sc.nextInt();
        int sum =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<s.length();i++)
        {
                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        pq.addAll(hm.values());
        while(!pq.isEmpty()&&k!=0)
        {
            int c = pq.remove();
            pq.add(--c);
            k--;
        }
        while(!pq.isEmpty())
        {
            sum+=Math.pow(pq.remove(),2);
        }
        System.out.println(sum);
}}
/*import java.util.*;
import java.util.Map.*;
public class San
{
    public static ArrayList<Integer>getmax(ArrayList<Integer>lst,int k)
    {
        if(k==0)
        {
            return lst;
        }
        else
        {
            int m = Collections.max(lst);
            lst.set(lst.indexOf(m),m-1);
            k--;
            return getmax(lst,k);
        }
    }
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        TreeMap<Character,Integer> hm= new TreeMap<>();
        String s = sc.next();
        int k =sc.nextInt();
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),1);
            }
            else
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        ArrayList<Integer>lst = new ArrayList<>(hm.values());
        int sum =0;
        ArrayList<Integer>lst1 = getmax(lst,k);
        for(int i=0;i<lst1.size();i++)
        {
            sum+=Math.pow(lst1.get(i),2);
        }
        System.out.println(sum);
        }
}*/
