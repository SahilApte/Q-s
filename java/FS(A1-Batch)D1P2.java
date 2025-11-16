/*
Jane makes her class students stand in a line and marks each student with 
number from 0 to n, for new each student the values is incremented by one. 
The first student is marked '0' and next student is marked '1' and so on. 
She provides a value (1-odd, 2-even) which tells whether to count the odd or 
even number of students, and asks Peter, her assistant to count the number of 
students who are marked with given odd/even value from a given start and end 
value (inclusive of both start and the end). Your task is to help Peter find 
the count.

input=2
5 9
1
output=3
Explanation:
Input line one is the number of input values, followed by the start and end 
value, followed by value for even/odd.
Output is 3, the odd values between 5 and 9 are [5,7,9]

input=2
5 9
2
output=2
Explanation:
Input line one is the number of input values, followed by the start and end 
value, followed by value for even/odd.
Output is 2, the even values between 5 and 9 are [6,8]

*/
import java.util.*;
class d1p2{
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        int[] arr = new int[j];
        for(int i = 0;i<j;i++){
            arr[i] = in.nextInt();
        }
        int num = in.nextInt();
        int low = arr[0];
        int high = arr[1];
        int range = high-low+1;
        int count = 0;
        int result = 0;
        /*
        for(int i = arr[0];i<=arr[1];i++){
            if(num == 1){
                if(i%2!=0){
                    count = count+1;
                        }
            }
            else if(num == 2){
                if(i%2==0){
                    count = count+1;
                }
                
            }
        }*/
        if(num%2==0){
            if(low%2==0 && high%2==0){
                result = (range/2)+1;
                System.out.println(result);
            }
            else{
                result = (range/2);
                System.out.println(result);
            }
        }
        else{
            if(low%2!=0 && high%2!=0){
                result = (range/2)+1;
                System.out.println(result);
            }
            else
            {
            result = (range/2);
            System.out.println(result);
            }
        }
        //System.out.println(count);
    }
}
