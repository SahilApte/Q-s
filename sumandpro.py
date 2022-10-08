# https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        ads = 0
        pro = 1
        for i in str(n):
            ads+=int(i)
            pro*=int(i)
        return pro - ads
"""   
codes in other langs such as c and java
##c
int subtractProductAndSum(int n){
    int summ=0,pro =1;
    while(n>0)
    {
        int mods = n%10;
        summ+=mods;
        pro*=mods;
        n = n/10;
    }
    return(pro - summ);

}
##java
class Solution {
    public int subtractProductAndSum(int n) {
        int ads = 0,pro = 1;
        while(n>0)
        {
            int mods=n%10;
            ads+=mods;
            pro *= mods;
            n /=10;
        }
        return(pro-ads);
    }
}
"""
