/*
Ronald gives an assignment to the class. He provides an array of unique values 
and ask the class to replace each element in the array by its corresponding rank. 
The rule is that the minimum value in the array will have the higher rank. Your 
task is to help the students in their task.

Sample test case
case=1
input=3
5 4 7
output=2 1 3
*/
import java.util.*;
class d42p2{
    public static int[] getArrRank(int[] arr){
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        Map<Integer,Integer> rankMap = new HashMap<>();
        int rank = 1;
        for(int num:sortedArr){
            rankMap.putIfAbsent(num, rank++);
        }
        int[] rankArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rankArr[i] = rankMap.get(arr[i]);
        }
        return rankArr;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] rankArr = new int[n];
        for(int i=0;i<n;i++){
            rankArr[i] = in.nextInt();
        }
        int[] rank = getArrRank(rankArr);
        System.out.println(Arrays.toString(rank));
    }
}
