/*Ganesh's lucky number is 3.
He works as an accountant in a company.
He likes to know the third highest salary among all the employees.

You will be given an array of salaries salary[].
You need to help Ganesh to find the third highest salary (distinct).

NOTE: Salary is in lakhs per annum.

Input Format:
-------------
Line-1: N space separated integers 

Output Format:
--------------
Print an integer, third highest salary.


Sample Input-1:
---------------
5
3 5 2 7 6

Sample Output-1:
----------------
5


Sample Input-2:
---------------
5
5 5 4 7 7

Sample Output-2:
----------------
4
*/
import java.util.*;
public class FS(A2-Batch)D7P2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        String s[] = sc.nextLine().split(" ");
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = new int[s.length];
        int p=0;
        for(String s1: s)
        {
            arr[p]= Integer.parseInt(s1);
            hs.add(arr[p]);
            p++;
        }
        ArrayList<Integer> lst = new ArrayList<>(hs);
        Collections.sort(lst);
        // int max = hs.size()<=3 ? lst.get(0):lst.get(lst.size()-3);
        if(hs.size()<=3)
        {
            System.out.println(lst.get(0));
        }
        else
        {
            System.out.println(lst.get(lst.size()-3));
        }
    }
}
