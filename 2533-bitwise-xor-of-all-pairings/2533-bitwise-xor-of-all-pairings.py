class Solution(object):
    def xorAllNums(self, nums1, nums2):
        res = 0
        if len(nums2)%2==1:
            for i in nums1:
                res =res^ i
        if len(nums1)%2==1:
            for i in nums2:
                res=res ^ i
        return res
