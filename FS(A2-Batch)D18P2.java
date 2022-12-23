/*Given an array of N elements and an element K, 
find the index of an array element .

Note: Using only Recursion



Sample TestCase: 
----------------------------------
Input:
------------
5 4 6 1 3 2 7 8 9 
5
Output:
-------------
[0]


Sample TestCase: 
----------------------------------
Input:
------------
5 4 6 1 3 2 7 8 7 
7

Output:
-------------
[6,8]*/


import java.util.*;
public class FS(A2-Batch)D18P2
{
    static ArrayList<Integer> lst1 = new ArrayList<>();
    static ArrayList<Integer> check(ArrayList<Integer> lst,int n,int i)
    {
        if(i>=lst.size())
        {
            return lst1;
        }
        if(lst.get(i)==n)
        {
            lst1.add(i);
            // lst.remove(i);
        }
        return check(lst,n,i+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        ArrayList<Integer> lst = new ArrayList<>();
        int n = sc.nextInt();
        for(String s1:s)
        {
            lst.add(Integer.parseInt(s1));
        }
        int i=0;
        System.out.println(check(lst,n,i));
    }
}
