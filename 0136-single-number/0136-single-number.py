class Solution(object):
    def singleNumber(self, nums):
        if nums is None or len(nums) == 0:
            return 0
        result=0
        for num in nums:  
                result ^= num
        return result;