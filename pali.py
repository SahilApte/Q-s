class Solution:
    def isPalindrome(self, x: int) -> bool:
        st = ""
        m = x
        m = x
        if(int(m)>=0):
            for i in range(len(str(x))):
                z = m%10
                st += str(z)
                m= m//10
            # print(type(st))
            # print(type(x))
            return x == int(st)
        
        
