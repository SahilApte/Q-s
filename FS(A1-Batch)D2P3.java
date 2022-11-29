/*
Mark is a class 9 student. His class teacher Betty, gives him a match box 
containing match sticks of variable lengths. Betty asks Mark to form an object 
in the form of a triangle and return the maximum value that can be formed from 
those match sticks. If he cannot form the given object, he has to communicate 
back to Betty by sending a value 0.

Sample test case

input=5
7 2 3 4 12
output=9
*/
import java.util.*;
class d2p3{
    
    static void Triangle(int n){
        
    }
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int min=0;
        for(int i=0;i<arr.length-2;i++){
            int res = arr[i]+arr[i+1];
            int res1 = arr[i+2];
            if(res>res1)
            {
                min = res1+res;
            }    
        }
        System.out.println(min);
    }
}
