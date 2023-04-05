There are two teams A and B with same N number of players.
Both the teams A and B have same set of jersey numbers for their players.

Both the teams stand in two lines opposite to each other from index 0...N-1.
Players from Team-A  in line-1 and Team-B in line-2.

You have to find an index mapping P, from A to B. 
A mapping P[i] = j means the jersey number of player[i] in Team-A appears in
Team-B at index j.

The teams A and B may contain duplicate jersey numbers.
You need to return, lexicographically smallest order

Sample TestCase:
----------------------------------------------
A = [12, 28, 46, 32, 50]
B = [50, 12, 32, 46, 28]
output=[1, 4, 3, 2, 0]


Sample TestCase:
----------------------------------------------
A = [10, 10, 20, 20, 20]
B = [20, 10, 20, 10, 20]
output=[1, 3, 0, 2, 4]

Background testcases
--------------------------------
case =1
input =5
12 28 46 32 50
50 12 32 46 28
output =1 4 3 2 0

case =2
input =5
10 10 20 20 20
20 10 20 10 20
output =1 3 0 2 4
  
  import java.util.*;
public class Jersey
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer>a = new ArrayList<>();
        ArrayList<Integer>b = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            b.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            int c= b.indexOf(a.get(i));
            if(c!=-1)
            {
            System.out.print(c+" ");
            b.set(c,-1);
            }
        }
        
        
    }
}
