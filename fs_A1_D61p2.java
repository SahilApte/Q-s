/*
There are N rail compartments and each compartment has an ID printed on it. 
Given an array of compartments where compartment[i] is the ID printed on i-th 
compartment.

There are 2 hooks for each compartment to connect with other compartment.
You need to form the rails by connecting the compartments with each other.
You can connect two compartments with each other if their IDs are consecutive.
e.g., consecutive numbers: 1,2,3,... or 5,6,7,8.

Your task is to find the length of the longest rail can be formed.

Input Format:
-------------
Line-1: An integer N represents number of compartments.
Line-2: N space separated integers, IDs of compartments.

   
Output Format:
---------------
Print an integer value
  
  
Sample Input-1:
---------------
7
12 6 5 10 11 7 8

Sample Output-2:
----------------
4

Explanation:
------------
The compartments with values 5,6,7,8 can be connected and 
the compartments with values 10,11,12 can be connected. 
So the rail with maximum length is 4.

Sample test case

case=1
input=7
12 6 5 10 11 7 8
output=4
*/
import java.util.*;
class d61p2{
    public static int func(int[] compartments, int n){
        Map<Integer, Integer> compCount = new HashMap<>();
        for(int compartment : compartments){
            compCount.put(compartment,compCount.getOrDefault(compartment,0)+1);
        }
            int maxConsecutive = 0;
            for(int compartment : compCount.keySet()){
                int count = compCount.get(compartment);
                if(count >0){
                int consecutive = 1;
                while(compCount.containsKey(compartment+consecutive)){
                    consecutive++;
                    count--;
                }
                    maxConsecutive = Math.max(maxConsecutive, consecutive);
            }
            }
            return maxConsecutive;
        }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] compartments = new int[n];
        for(int i=0;i<n;i++){
            compartments[i] = in.nextInt();
        }
        System.out.println(func(compartments,n));
    }
}
