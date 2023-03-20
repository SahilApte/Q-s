Given three integers  'A' denoting the first term of an arithmetic sequence ,
'C' denoting the common difference of an arithmetic sequence and an integer 'B'.
you need to tell whether 'B' exists in the arithmetic sequence or not. 
Return 1 if B is present in the sequence. Otherwise, returns 0.

Sample TestCase:
-----------------------------------------
input=1 3 2
output=1


Explaination:
--------------------
3 is the second term of the 
sequence starting with 1 and having a common 
difference 2.


Sample TestCase:
-----------------------------------------
input=1 2 3
output=0

Explaination:
------------------------------
2 is not present in the sequence.
  
  import java.util.*;
public class Test
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<Integer>lst = new ArrayList<>();
        for(int i=a;i<=b;i+=c)
        {
            if(i==b)
            {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
