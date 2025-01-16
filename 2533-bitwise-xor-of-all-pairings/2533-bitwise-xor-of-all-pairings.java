class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = 0;
        if(nums2.length%2==1)
        {
            for(int i:nums1)
                res =res^ i;
        }
        if(nums1.length%2==1)
        {
            for(int i:nums2)
                res=res ^ i;
        }
        return res;
    }
}