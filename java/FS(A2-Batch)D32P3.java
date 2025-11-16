/*Once upon a time, there was a young programmer named Alex who had just started
learning programming.
 One day, while studying arrays, Alex came across a problem: given an array, 
 they had to rotate the array by three positions in the clockwise direction.

Alex was excited to solve the problem and started thinking about how they 
could approach it.Your task is to help alex to do the above.


Sample Testcase:
------------------------
input=1
output=1

Sample Testcase:
------------------------
input=1 2 3 4 5 6
output=4 5 6 1 2 3

*/
import java.util.*;
public class Pro
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int arr[]= new int[s.length];
        int k =0;
        for(String s1:s)
        {
            arr[k] = Integer.parseInt(s1);
            k++;
        }
        ArrayList<Integer> lst =new ArrayList<>();
        ArrayList<Integer> lst1 =new ArrayList<>();
        
        for(int i=arr.length-1;i>2;i--)
        {
            lst1.add(lst.get(i));
        }
        System.out.print(lst1+" ");
        for(int i=0;i<arr.length-3;i++)
        { 
             System.out.print(lst.get(i)+" ");
        }
        
       
    }  
}
