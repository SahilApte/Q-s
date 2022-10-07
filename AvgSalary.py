class Solution:
    def average(self, salary: List[int]) -> float:
        salary.remove(min(salary))
        salary.remove(max(salary))
        summ =0
        for i in salary:
            summ+=i
        return summ/len(salary)
        
