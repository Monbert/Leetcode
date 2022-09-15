#
# @lc app=leetcode id=739 lang=python3
#
# [739] Daily Temperatures
#

# @lc code=start
class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        res = [0] * n
        for day in range(n):
            for future_day in range(day+1, n):
                if temperatures[future_day] > temperatures[day]:
                    res[day] = future_day - day
                    break
        return res        
# @lc code=end

