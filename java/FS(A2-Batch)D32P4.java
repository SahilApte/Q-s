/*Once upon a time, there was a young programmer named Alex who had just started
learning programming.
 One day, while studying arrays, Alex came across a problem: given an array, 
 they had to rotate the array by one position in the clockwise direction.

Alex was excited to solve the problem and started thinking about how they 
could approach it.Your task is to help alex to do the above.

case=1
input=1
output=1

case=2
input=1 2 3 4 5 6
output=6 1 2 3 4 5

case=3
input=10 20 30 40 50
output=50 10 20 30 40

case=4
input=-3 -1 0 2 -5
output=-5 -3 -1 0 2

case=5
input=8 9
output=9 8*/
import java.util.*;
public class FS(A2-Batch)D32P4
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        for(String s1: s)
        {
            lst.add(Integer.parseInt(s1));
        }
        lst1.add(lst.get(lst.size()-1));
        for(int i =0;i<lst.size()-1;i++)
        {

            lst1.add(lst.get(i));
        }
        
        System.out.println(lst1);
    }
}
