https://leetcode.com/problems/total-hamming-distance/submissions/963798822/
class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                total+=hamm(nums[i],nums[j]);
            }
        }
return total;
    }
        public int hamm(int x,int y)
        {
            return Integer.bitCount(x^y);
            /*int xor = x^y;
            int count=0;
            while(xor!=0)
            {
                xor = xor & (xor-1);
                count++;
            }
            return count;
        }*/
}}
