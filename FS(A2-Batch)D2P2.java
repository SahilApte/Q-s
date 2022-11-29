/*You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer
variables ‘num’ and ‘diff’. Implement this function to find and return 
the number of elements of ‘arr’ having an absolute difference of less than
or equal to ‘diff’ with ‘num’.

Note: In case there is no element in ‘arr’ whose absolute difference with 
‘num’ is less than or equal to ‘diff’, return -1.

Sample Testcase:
------------------------
Input:
------------------
12 3 14 56 77 13
13
2

Output:
----------
3

Explanation:
arr=12 3 14 56 77 13
num=13
diff=2
Elements of ‘arr’ having absolute difference of less than or equal to 
‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.

import java.util.*;
class Main 
{
    public static int findCount (int arr[], int length, int num, int diff) 
    {
    
    }
    
    }*/
import java.util.*;
public class Prog
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int num = sc.nextInt();
        int diff = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        // int lst[]= new int[s.length];
        int j=0;
        for(String i :s)
        {
            
            lst.add(Integer.parseInt(i));
            // lst[j] = Integer.parseInt(i);
        }
        int val = fc(lst,lst.size(),num,diff);
        int max = (val ==0) ? -1:val;
        
        // if(fc(lst,lst.size(),num,diff)==0)
        // {
        //     System.out.print("-1");    
        // }
        // else
        // {
        //     System.out.print(fc(lst,lst.size(),num,diff));
        // }
        System.out.print(max);
    }
    static int fc(ArrayList<Integer> arr,int len,int num,int diff)
    {
        int count =0;
        for(int i=0;i<len;i++)
        {
            if(Math.abs(arr.get(i)-num)<=diff)
            {
                count ++;
            }
        }
        return count;
    }
}
