/*
James is the CEO of MegaSoft company. He wants to moderate the average salary 
of his employees. He thinks there is a huge gap in the salary of the employee 
who is getting the least salary and the employee who is getting the highest 
salary. To moderate the salary, he asks Peter, his accountant to skip these 
two salaries and find the average salary of remaining employees (precision to 
two decimal places). Help Peter in his task.

input=4
25505 30000 15000 40000
output=27752.50
*/
import java.util.*;
class FS(A1-Batch)D1P3{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i<num;i++){
            arr[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = arr[0];
        double count  = 0;
        for(int i = 0;i<num;i++){
            count = count + arr[i];
        if(arr[i]<min)
        {
         min = arr[i];   
        }
        else if(arr[i]>max)
        {
            max = arr[i];
        }
        }
        System.out.println((count-(max+min))/(num-2));
    }
}
