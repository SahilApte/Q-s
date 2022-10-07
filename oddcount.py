class Solution:
    def countOdds(self, low: int, high: int) -> int:
        return ((high+1)//2)-(low//2)
# this code works even for large values
#normal bruteforce technique using mod operations wont work for large values
