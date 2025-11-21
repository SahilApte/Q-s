# https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1

O(sqrt(N)) optimial 
#User function Template for python3
import math
class Solution:
    def print_divisors(self, N):
        # code here
        result=[]
        # for i in range(1,int(math.sqrt(N))+1)  :
        for i in range()
            if(N%i)==0:
                result.append(i)
                if(N//i!=i):
                    result.append(N//i)
        
        result.sort();
        for i in range(len(result)):
            print(result[i],end=" ")

#User function Template for python3
class Solution:
    def print_divisors(self, N):
        # code here
        result = []
        for i in range(1, int(N**0.5) + 1):  # Using **0.5 instead of math.sqrt
            if (N % i) == 0:
                result.append(i)
                if (N // i != i):
                    result.append(N // i)
        
        result.sort()
        for i in range(len(result)):
            print(result[i], end=" ")            