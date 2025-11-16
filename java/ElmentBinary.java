import java.io.*;
import java.util.*;
public class ElementBinary
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        for(int i =0;i<row;i++)
        {
            for(int j = 0;j<column;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int start =0;
        int end = (row*column) -1;
        boolean flag = false;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(arr[mid/column][mid%column] == target)
            {
                flag = true;
                System.out.print(flag);
                break;
            }
            else if(arr[mid/column][mid%column]< target)
            {
                start = mid +1;
            }
            else if(arr[mid/column][mid%column]> target)
            {
                end = mid -1;
            }
            
        }
        if(flag == false)
        {
            System.out.print(flag);
        }
        
        
        
        
    }
}
