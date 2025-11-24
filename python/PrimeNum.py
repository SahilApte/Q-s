# https://www.geeksforgeeks.org/problems/prime-number2314/1
# 2 different optimal logics
# class Solution:
#     def isPrime(self, n):
#         if n == 1:
#             return False
        
#         factors = 0
#         i = 1
#         while i * i <= n:
#             if n % i == 0:
#                 factors += 1
#                 if n // i != i:
#                     factors += 1
#             if factors > 2:
#                 return False
#             i += 1
        
#         return True

import math
class Solution:
    def isPrime(self, n):
        if n <= 1:
            return False
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                return False
        return True