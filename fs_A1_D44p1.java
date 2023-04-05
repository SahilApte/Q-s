/*
There are N persons in the room, each person is paired with other person except 
one. Every person is identified with an ID number, and every pair will have 
same ID number.

You will be given the ID's of N persons as a list[].
Your task is to find the person ID, who is not paired with anyone in the room.

Can you solve this problem in O(N) time complexity?

Sample test case

case=1
input=9
3 1 3 4 6 7 4 6 1
output=7

*/

import java.util.*;
class d44p1{
    public static int findUnpairedId(int[] id){
        int res = 0;
        for(int i=0;i<id.length;i++){
            res ^= id[i];
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] id = new int[n];
        for(int i=0;i<n;i++){
            id[i] = in.nextInt();
        }
        int res = findUnpairedId(id);
        System.out.println(res);
    }
}
