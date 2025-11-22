# https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

class Solution:
    def gcd(self, a, b):
        # code here
        while(a>0 and b>0):
            if(a>b):
                a=a%b
            else:
                b=b%a
        
        if(a==0):
            return b
        else:
            return a


            