"""There are a set of boxes and each box has a number.
Anil arranged these set of boxes in an array. b[i] is the number written on ith box.
Your task is to return "true" if b[i]==b[j], otherwise return "false".

Input Format:
-------------
Line-1: n space separated integers represent number on each box.

Output Format:
--------------
boolean value

Input: nums = [1,3,2,1]
Output: true

Input: nums = [1,2,3,4,5]
Output: false

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Sample test case
case=1
input=1 3 2 1
output=true
"""
a = list(map(int,input().split()))
b = set(a)
print("false" if(len(a)==len(b)) else "true")
