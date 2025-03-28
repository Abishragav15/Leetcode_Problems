class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        permute(nums, new ArrayList<Integer>(), new boolean[nums.length]);
        return result;
    }
    public void permute(int[] nums, List<Integer> list , boolean[] used) {
        if(list.size() == nums.length){
            result.add(new ArrayList(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){ 
            if(!used[i]){
                if(i == 0 || nums[i-1] != nums[i] || used[i-1]){
                used[i] = true;
                list.add(nums[i]);
                permute(nums, list, used);
                used[i] = false;
                list.remove(list.size()-1);  
                }}
        }        
    }
}