/*Given an NxN matrix Mat. Sort all elements of the matrix.


Sample Testcase:
--------------------------
Input:
------------------------
4
10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50

Output:
--------------------------
10 15 20 25 
27 29 30 32
33 35 37 39
40 45 48 50

Explanation:
Sorting the matrix gives this result.
*/
import java.util.*;
public class FS(A2-Batch)D26P3
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int mat[] = new int[n*n+1];
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=1;i<=n*n;i++)
        {
            mat[i] = sc.nextInt();
        }
        Arrays.sort(mat);
        for(int i=1;i<=n*n;i++)
        {
            System.out.print(mat[i]+" ");
            if(i%n==0)
            {
                System.out.println();
            }
        }
        
    }
}
