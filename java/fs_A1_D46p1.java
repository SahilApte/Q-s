/*
Given a unsorted array and k, return the kth smallest element without sorting. 

Sample test case
case=1
input=5
3 12 5 10 7
4
output=10

*/
import java.util.*;
class d46p1{
    /*
    public static int kthSmallest(int[] arr,int k){
        int left = 0,right = arr.length-1;
        Random rand = new Random();
         while(left<=right){
             int pivot = rand.nextInt(right-left+1)+left;
             int newPivot = partition(arr,left,right,pivot);
             if(newPivot == k-1){
                 return arr[newPivot];
             } else if(newPivot>k-1){
                 right = newPivot-1;
             }else {
                 left = newPivot + 1;
             }
         }
         return -1;
    }
    public static int partition(int[] arr,int left,int right,int pivot){
        int pivotVal = arr[pivot];
        int i = left;
        swap(arr, pivot,right);
        for(int j = left;j<right;j++){
            if(arr[j]<pivotVal){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,right);
        return i;
    }
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        int result = kthSmallest(arr,k);
        System.out.println(result);
    }
}*/
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    List<Integer>al = new ArrayList<>();
    for(int i=0;i<n;i++){
        al.add(in.nextInt());
    }
    int nums = in.nextInt();
    TreeSet<Integer>ts = new TreeSet<>(al);
    al.clear();
    for(int i:ts){
        al.add(i);
    }
    System.out.println(al.get(nums-1));
}
}
