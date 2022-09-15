#
# @lc app=leetcode id=20 lang=python3
#
# [20] Valid Parentheses
#

# @lc code=start
class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) % 2 == 1:
            return False
        
        pairs = {
            "(" : ")",
            "[" : "]",
            "{" : "}",
        }
        stack = list()

        for c in s:
            if c in pairs:  # if it's the left bracket
                stack.append(c)
            elif not stack or pairs[stack.pop()] != c:  #"{[    ]}"  不符合规则的话 就无法pop()
                return False
        return not stack


        # for c in s:
        #     if c in pairs:
        #         if not stack or stack[-1] != pairs[c]:
        #             return False
        #         stack.pop()
        #     else:
        #         stack.append(c)
        # return not stack


# @lc code=end
