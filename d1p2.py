"""
There are a set of boxes and each box has a number.
Rohan arranged these set of boxes in an array. b[i] is the number written on ith box.
Given a key value k, Your task is to return "true" if b[i]==b[j] and abs(i-j)<=k.
otherwise return "false".

Input Format:
-------------
Line-1: An integer n, number of boxes.
Line-2: n space separated integers represents number on each box.
Line-3: key value


Output Format:
--------------
boolean value

Constraints:

    1 <= n <= 10^5
    -10^9 <= b[i] <= 10^9
	0<=k<=10^5



Sample Input-1:
---------------
4
5 2 3 5
3

Sample Output-1:
----------------
true

Explanation-1:
--------------
b[0]==b[3] and abs(0-3)<=3


Sample Input-2:
---------------
6
4 2 3 6 4 7
2

Sample Output-2:
----------------
false

Explanation-2:
-------------
There is no index pair with the given contraints satisfied.
"""
