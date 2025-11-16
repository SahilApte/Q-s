/*
Given a unsorted array and k, return the kth largest element without sorting. 

Sample test case
case=1
input=5
3 12 5 10 7
4
output=5

*/
import java.util.*;
class d46p2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<n;i++){
            ts.add(in.nextInt());
        }
        int nums = in.nextInt();
        List<Integer> al = new ArrayList<>(ts);
        System.out.println(al.get(al.size()-nums));
    }
}
