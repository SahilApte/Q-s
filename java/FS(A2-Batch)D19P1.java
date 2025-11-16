/*On the way to Neil Gogte Institute of technology college there are
sequence of vacant plots.Each plot has a different area.
NGIT management want to buy k acres of land to build hostel.

Your task is to help management to find contiguous plots of minimum 
length whose sum is exactly K acres.

Sample TestCase:
-----------------------------------------
input:
-------------------
7 
2 3 1 2 4 3

Output:
--------------------
2
Explanation: The subarray [4,3] has the minimal length under the
problem constraint.


Sample TestCase:
-----------------------------------------
input:
-------------------
4
1 4 4
Output:
--------------------
1
*/
import java.util.*;
public class FS(A2-Batch)D19P1
{
    public static void main(String argsp[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s= sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        int p=0;
        
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        for(String s1:s)
        {
            arr[p] = Integer.parseInt(s1);
            lst1.add(Integer.parseInt(s1));
            p++;
        }
        Arrays.sort(arr);
        int summ =0;
        boolean b = false;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(lst1.contains(n))
            {
                System.out.println(1);
                System.exit(0);
            }
            else 
            {
                if(summ!=n)
                {
                    summ= n-arr[i];
                    if(lst1.contains(summ))
                        {
                            lst.add(arr[i]);
                            b = true;
                            break;
                        }
                }
            }
        }
        if(b==true)
        {System.out.println(lst.size()+1);}
        else
        {
            System.out.println(0);
        }
    }
}
