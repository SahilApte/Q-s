/*Martha makes her class students stand in a line and marks each student with 
number from 0 to n, for new each student the values is incremented by one. 
The first student is marked '0' and next student is marked '1' and so on. 
She asks John, her assistant to count the number of students who are marked 
with odd value from a given start and end value (inclusive of both start and 
the end). Your task is to help John find the count.

input=2
5 9
output=3
Explanation:
Input line one is the number of input values, followed by the start and end value
Output is 3, the odd values between 5 and 9 are [5,7,9]

input=2
6 8
output=1
Explanation:
Input line one is the number of input values, followed by the start and end value
Output is 1, the odd values between 6 and 8 are [7]
*/
import java.util.*;

class FS(A1-Batch)D1P1{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        int[] arr = new int[j];
        for(int i=0;i<j;i++){
            arr[i] = in.nextInt();
        }
        int count = 0;
        //int start = arr[0];
        //int end = arr[1];
        for(int i = arr[0];i<=arr[1];i++){
        if(i%2 != 0){
            count = count+1;
        }
        }
        System.out.println(count);
    }
}
