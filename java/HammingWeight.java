https://leetcode.com/problems/number-of-1-bits/submissions/963801246/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0)
        {
            int end = n&1;
            count+=end;
            n>>>=1;
        }
        return count;           
    }
}
