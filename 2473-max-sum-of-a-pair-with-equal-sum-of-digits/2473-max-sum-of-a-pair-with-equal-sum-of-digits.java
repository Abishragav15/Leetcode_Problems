class Solution {
    public int maximumSum(int[] nums) {
        int maxSum = -1;
        int[] arr  = new int[90];
        for(int n : nums){
            int sum = getSum(n);
            if(arr[sum] == 0){
                arr[sum] = n;
            }else{
                int tempSum = arr[sum] + n;
                maxSum = Math.max(maxSum, tempSum);
                arr[sum] = Math.max(n, arr[sum]);
            }}
        return maxSum;
    }
    int getSum(int n){
        int temp = 0;
        while(n != 0){
            int digit = n % 10;
            n /= 10;
            temp += digit;
        }
        return temp;
    }}