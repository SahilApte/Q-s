/*In a class of XII computer teacher asked one of the student to perform 
a task as practical session .

There is a box contains N balls in it, each ball is printed with
a positive integer.The teacher ask the student to split all the 
balls in the box into ball-groups, each group should contain exatly S balls.

The student has to pick the ball-groups as follows:
	- the balls should be numbered consecutively.
	e.g., 1,2 3, 4 or 4,5,6,7 etc.

Finally, the student should say whether it is possible to 
split all the balls in the box, into ball-groups accordingly.

Now. its your task to help the student to find whether it is possible or not.
if possible, print "true".
otherwise, print "false".

Input Format:
-------------
Line-1: Two integers N and S, number of balls and size of ball-group.
Line-2: N space separated integers, integers printed on each ball.

Output Format:
--------------
Print a boolean value, whether it is possible to split all the balls 
into groups.


Sample Input-1:
---------------
8 4
2 6 3 4 3 5 4 5

Sample Output-1:
----------------
true

Explanation:
-------------
Ball-groups are [2,3,4,5] and [3,4,5,6]


Sample Input-2:
---------------
12 3
12 2 9 5 3 4 13 7 6 8 11 7

Sample Output-2:
----------------
true

Explanation:
-------------
Ball-groups are [2,3,4], [5,6,7], [7,8,9] and [11,12,13]


Sample Input-3:
---------------
6 3
2 5 7 3 4 8

Sample Output-3:
----------------
false

Explanation:
-------------
you cannot form ball groups.*/
import java.util.*;
public class FS(A2-Batch)D4P2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        ArrayList <Integer> lst = new ArrayList<>();
        ArrayList <Integer> lst1 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            lst.add(sc.nextInt());
        }
        Collections.sort(lst);
        boolean flag = true;
        int z = n/s;
        for(int i=0;i<z;i++)
        {
            //8 4
            //2 3 3 4 4 5 5 6
            //2 3 4 5
            //3 4 5 6
            //6 3
            //
            int start = lst.get(0);
            for(int j=0;j<s;j++)
            {
                int temp = start +j;
                // System.out.print(temp);
                if(lst.contains(temp))
                {
                   lst1.add(temp); 
                }
                lst.remove(new Integer(temp));
            }
            if(lst1.size()!=s)
            {
                flag = false;
                System.out.print(flag);
                System.exit(0);
            }
            lst1.clear();
        }
        System.out.print(flag);
    }
}
            
            
            
