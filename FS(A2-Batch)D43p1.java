FS(A2-Batch)D43p1.java
There are two students in a class named '0' and '1'.
The height and width will be given by the teacher. 
There are many positions in the class to be occupied.
When the teacher asks the students to occupy the positions,
'1'  occupies all the postions and gives the turn to '0', to sit only in the 
middle(horizantally and vertically)

Help students to occupy the postions
There is a twist in this seating arrangement, if the height and width given 
by the teacher is a even integer , students dont occupy at all,in this 
case print -1 

Note-Here the height and width are same

input = 3
output =
101
000
101

input = 5
output =
11011
11011
00000
11011
11011

input = 7
output =
1110111
1110111
1110111
0000000
1110111
1110111
1110111



  import java.util.*;
public class Pattern10
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2!=0)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==n/2)
                {
                    System.out.print("0".repeat(n));
                    break;
                }
                if(j==n/2)
                {
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
                
                
            }
            System.out.println();
        }
        }
        else
        {
            System.out.println(-1);
            return;
        }
    }
}
