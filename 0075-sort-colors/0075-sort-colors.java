class Solution {
    public void sortColors(int[] nums) {
        int a;
      int low=0;
      int middle=0;
      int high=nums.length-1;;
      while(middle <= high){
        if(nums[middle]==0){
            int temp=nums[middle];
            nums[middle]=nums[low];
            nums[low]=temp;
            low++;
            middle++;
        }
        else if(nums[middle]==1){
            middle++;
        }
        else if(nums[middle]==2){
            int temp=nums[middle];
            nums[middle]=nums[high];
            nums[high]=temp;
            high--;
        }
        else{
            System.out.println("no");
        }

      }
    }
}