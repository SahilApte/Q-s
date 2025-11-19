/**
 * Leetcode Problem 9: Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int result =0;
        int num = x;
        while(num>0){
            int ldf = num%10;
            result = result*10+ldf;
            num = num/10;
        }
        return result==x;
    }
}