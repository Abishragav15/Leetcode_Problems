class Solution {
    public int findMin(int[] nums) {
        int f=0;
        int l=nums.length-1;
        while(f<l){
            int mid= f+(l-f)/2;
        if(nums[mid] >nums[l]){
            f=mid+1;
        }
        else if(nums[mid] < nums[f]){
            l=mid;
        }
        else{
            l--;
        }}
        return nums[f];
         }}