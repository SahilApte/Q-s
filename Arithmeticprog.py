# https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/submissions/
class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr = sorted(arr)
        for i in range(1,len(arr)-1):
            if abs(arr[i-1]-arr[i])!= abs(arr[i+1] - arr[i]):
                return False
        return True       
#  other approacher
# in discuss page
