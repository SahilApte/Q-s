/*Naveen purchased two boxes Box1 and Box2 containing gold coins. The weights of 
the gold coins are unique. The gold coins of Box1 are a subset of Box2. Naveen 
wants to find out for each coin in Box1 whether there exists a coin in Box2 
which is heavier. If there exist a coin in Box2 that is heavier, then he wants 
to know the coin in Box2. If there exist more than one coin in Box2 that is 
heavier, then he wants to know the first heavier coin. If there are no coin in 
Box2 that is heavier, then return -1 for that coin.

Your task is to help Naveen in his task.

Sample test case

input=3 4
7 5 6
5 6 8 7
output=[-1, 6, 8]
*/
import java.util.*;
class d11p2{
    /*
    List<Integer> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] arr1 = new int[b1];
        int[] arr2 = new int[b2];
        int[] res = new int[10];
        for(int i = 0;i<b1;i++){
                arr1[i] = in.nextInt();
        }
            for(int j = 0;j<b2;j++){
                arr2[j] = in.nextInt();
            }
            for(int i = 0;i<b1;i++){
                for(int j = 0;j<b2;j++){
                // if(arr1[i]<arr2[j+1]){
                //     res[10] = arr2[j+1];
                // }
                if(arr1[i] == arr2[j]){
                    for(int k = 0;k<b2;k++){
                        if(arr2[k]>arr1[i]){
                            res[i] = arr2[k];
                            break;
                        }
                else
                    res[i] = -1;
                }
            }
                    }
                }
        System.out.print(Arrays.toString(res));*/
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] nums1 = new int[b1];
        int[] nums2 = new int[b2];
        for(int i=0;i<b1;i++){
            nums1[i] = in.nextInt();
        }
        for(int j=0;j<b2;j++){
            nums2[j] = in.nextInt();
        }
        //int[] res = nextGreater(nums1[],nums2[]);
        //System.out.print(res);
        //public int[] nextGreater(int[] nums1, int[] nums2){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int cur: nums2){
        for(int i = 0;i<nums2.length;i++){
            //int cur = nums2[i];
            while(!stack.isEmpty() && cur>stack.peek()){
                hmap.putIfAbsent(stack.pop(),cur);
            }
            stack.push(cur);
        }
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums1.length;i++){
            if(hmap.containsKey(nums1[i])){
                res[i] = hmap.get(nums1[i]);
            }
            // else
            // {
            //     res[i] = -1;
            // }
            }
            for(int i = 0;i<b1;i++){
                System.out.print(res[i]+" ");
            }
        }
        
        }   
}
