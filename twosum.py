class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lst=[]
        for i in range(len(nums)):
            temp = nums[i]
            for j in range(i+1,len(nums)):
                    if temp+ nums[j] == target:
                        lst.append(i)
                        lst.append(j)
                        break
                    else:
                        continue
        return lst
