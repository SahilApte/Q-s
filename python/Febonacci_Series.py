# http://geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1  /


# class Solution:
#     def fibonacciNumbers(self, n):
#         if n == 1:
#             return [0]
#         if n == 2:
#             return [0, 1]
        
#         num = [0, 1]
#         for i in range(n - 2):
#             sum = num[i] + num[i + 1]
#             num.append(sum)
        
#         return num


def febonaaci_recursion(n):
        if(n==0):
            return 0
        if(n==1):
            return 1
        first = febonaaci_recursion(n-1)
        second = febonaaci_recursion(n-2)

        return first + second

if __name__ == "__main__":
        n = 6

        print(febonaaci_recursion(n))