#https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

#User function Template for python3

class Solution:
    def armstrongNumber (self, n):
        # code here 
        dup = n
        result =0;
        while(n!=0):
            lastDigit=n%10
            result= lastDigit*lastDigit*lastDigit + result
            n//=10
        return result==dup
        