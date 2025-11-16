/*
Michael gifted his daughter Julie a robot. The robot is programmed to jump a 
fixed length of distance. Julie wants to construct a toy bridge with some gaps. 
Given a list of values that represent the steps on the bridge, help Julie 
constructs the bridge by re-arranging the steps, so that the robot can jump on 
those steps and cross the bridge successfully. The fixed distance the robot can 
jump will be the common difference between the values of the steps. If the robot 
crosses the bridge successfully, return true, else return false.  
Your task is to help Julie complete in her task.

Input: 5
7 6 5 4 3
Output: true
*/
import java.util.*;

class d3p3{
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int diff = arr[0]-arr[1];
        boolean res = true;
        for(int i = 0;i<arr.length-1;i++){
            if(diff!=(arr[i]-arr[i+1])){
                res=false;
                break;
            }

        }
        System.out.println(res);
    }
}
