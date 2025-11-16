//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/solutions/?envType=study-plan&id=programming-skills-i&orderBy=newest_to_oldest
class Solution {
    public boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i< nums.length-1;i++){
            if(nums[i]-nums[i-1]!=nums[i+1]-nums[i]){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean flag = true;
        int d = arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]!=d)
            flag = false;
        }
        return flag;
    }
}
