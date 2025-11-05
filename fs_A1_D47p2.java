/*
Mary is given two arrays, nums1 and nums2, sorted in ascending order and two 
integers m and n, representing the number of elements in each array respectively. 
She has to merge these two arrays into a single array sorted in ascending order. 
The final sorted array should be stored inside the array nums1 and returned. 
To accommodate this, nums1 has a length of m+n, where the first m elements 
denote the elements to be merged and last n elements are set to 0 and should 
be ignored, nums2 has length of n. Your task is to help Mary in her task.

Sample test case
case=1
input=6
1 2 3 0 0 0
3
2 5 6
3
output==[1 2 2 3 5 6]

explanation: 6 elements of num1, m=3 elements of nums1; n=3, followed by 3 
elements of nums2.
*/import java.util.*;
class d47p2{
    /*
        
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(arr[i]>arr1[j]){
                arr[k--] = arr[i--];
            } else{
                arr[k--] = arr1[j--];
            }
        }
        while(j>=0){
            arr[k--]=arr1[j--];
        }
    }    
    */
        
    public static void merge(int arr[],int m,int arr1[],int n){
        int i=0,j=0,k=0;
        int[] temp = new int[m+n];
        while(i<m && j<n){
            if(arr[i]<arr1[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr1[j++];
            }
        }
        while(i<m){
            temp[k++] = arr[i++];
        }
        while(j<n){
            temp[k++] = arr1[j++];
        }
        for(i=0;i<m+n;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = in.nextInt();
        }
        int o = in.nextInt();
        in.close();
        /*
        int[] sortedArr = mergeSort(arr1, n, arr2, n1);
        for(int i=0;i<sortedArr.length;i++){
        System.out.print(sortedArr[i] + " ");
        }
        */
        merge(arr1,n,arr2,m);
        System.out.println(Arrays.toString(arr1));
    }
}
