/*Mr.Kedar is working as a salesman under shirts division in R.S.Brothers.
His manager assigned him the task to organize the shirts in sorted order
'Small','Medium','Large'.He should organize in-place so that shirts of same
size are adjacent.

We will use integers integers 24,34,44 to represent Small,Medium,Large 
respectively.

Your task is to help Mr.Kedar to complete his task without using any
predifined functions.


Sample TestCase:
---------------------------
input:
-------------------
24 34 44 24 34 34 24

output:
--------------------
24 24 24 34 34 34 44


Sample TestCase:
---------------------------
input:
-------------------
44 24 34

output:
--------------------
24 34 44*/
import java.util.*;
public class FS(A2-Batch)D7P3
{
    public static int[] swap(int arr[],int val,int mid)
    {
        int temp =0;
        temp = arr[mid];
        arr[mid] = arr[val];
        arr[val]= temp;
        return arr;
    }
    public static int[] DNF(int arr[])
    {
        int low =0;
        int high = arr.length-1;
        int mid = 0;
        int temp =0;
        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 24:
                    {
                        swap(arr,low++,mid++);
                        // low++;
                        // mid++;
                        break;
                    }
                case 34:
                    {
                        mid++;
                        break;
                    }
                case 44:
                    {
                        swap(arr,high--,mid);
                        // high--;
                        break;
                    }
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String [] s = sc.nextLine().split(" ");
        int arr[] = new int[s.length];
        int p=0;
        for(String i:s)
        {
            arr[p] = Integer.parseInt(i);
            p++;
        }
        DNF(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
        /*Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        */
        /*int temp=0;
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]>arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    */
